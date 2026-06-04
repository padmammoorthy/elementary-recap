package com.elementaryrecap.controller;

import com.elementaryrecap.model.AppUser;
import com.elementaryrecap.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {

    private final UserRepository userRepository;

    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/profile")
    public String profile(Model model, Authentication auth) {
        if (auth != null) {
            userRepository.findByUsername(auth.getName()).ifPresent(u -> model.addAttribute("currentUser", u));
        }
        return "profile";
    }

    @PostMapping("/profile/avatar")
    public String updateAvatar(@RequestParam String avatar, @RequestParam String avatarType, Authentication auth) {
        if (auth != null) {
            userRepository.findByUsername(auth.getName()).ifPresent(user -> {
                user.setAvatar(avatar);
                user.setAvatarType(avatarType);
                userRepository.save(user);
            });
        }
        return "redirect:/profile";
    }
}
