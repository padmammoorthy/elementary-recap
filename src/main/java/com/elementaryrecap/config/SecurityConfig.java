package com.elementaryrecap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Set;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration c) throws Exception {
        return c.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(a -> a
                .requestMatchers("/portal", "/login", "/login/**", "/signup", "/signup/**", "/css/**", "/images/**", "/h2-console/**").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/parent/**").hasRole("PARENT")
                .anyRequest().authenticated())
            .formLogin(f -> f.loginPage("/portal").loginProcessingUrl("/login").successHandler(roleBasedSuccessHandler())
                .failureHandler((req, res, ex) -> {
                    String p = req.getParameter("portal");
                    res.sendRedirect("parent".equals(p) ? "/login/parent?error" : "student".equals(p) ? "/login/student?error" : "/portal?error");
                }).permitAll())
            .logout(l -> l.logoutUrl("/logout").logoutSuccessUrl("/portal")
                .logoutRequestMatcher(new org.springframework.security.web.util.matcher.AntPathRequestMatcher("/logout", "GET")).permitAll())
            .csrf(c -> c.ignoringRequestMatchers("/h2-console/**", "/answer", "/tests/*/save-answers", "/logout", "/profile/**"))
            .headers(h -> h.frameOptions(f -> f.sameOrigin()));
        return http.build();
    }

    @Bean
    public AuthenticationSuccessHandler roleBasedSuccessHandler() {
        return (HttpServletRequest req, HttpServletResponse res, Authentication auth) -> {
            Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());
            String portal = req.getParameter("portal");
            if ("parent".equals(portal) && !roles.contains("ROLE_PARENT")) {
                req.getSession().invalidate();
                res.sendRedirect("/login/parent?roleError");
                return;
            }
            if ("student".equals(portal) && roles.contains("ROLE_PARENT")) {
                req.getSession().invalidate();
                res.sendRedirect("/login/student?roleError");
                return;
            }
            if (roles.contains("ROLE_ADMIN")) res.sendRedirect("/admin");
            else if (roles.contains("ROLE_PARENT")) res.sendRedirect("/parent/dashboard");
            else res.sendRedirect("/lessons");
        };
    }
}
