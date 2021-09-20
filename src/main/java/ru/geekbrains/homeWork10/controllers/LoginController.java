/**
 * Домашняя работа №10
 * */
package ru.geekbrains.homeWork10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showMyLoginPage() {
        return "modern-login";
    }

    @GetMapping("/accessDenied")
    public String showAccessDeniedPage() {
        return "access-denied";
    }
}
