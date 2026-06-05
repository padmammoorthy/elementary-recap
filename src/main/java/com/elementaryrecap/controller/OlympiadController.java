package com.elementaryrecap.controller;

import com.elementaryrecap.model.Test;
import com.elementaryrecap.repository.UserRepository;
import com.elementaryrecap.service.TestService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OlympiadController {

    private final TestService testService;
    private final UserRepository userRepository;

    public OlympiadController(TestService testService, UserRepository userRepository) {
        this.testService = testService;
        this.userRepository = userRepository;
    }

    @GetMapping("/olympiad")
    public String olympiad(Model model, Authentication authentication) {
        List<Test> funTests = testService.getTestsByCategory("fun");
        model.addAttribute("tests", funTests);
        if (authentication != null) {
            userRepository.findByUsername(authentication.getName()).ifPresent(user -> model.addAttribute("currentUser", user));
        }
        return "olympiad";
    }
}
