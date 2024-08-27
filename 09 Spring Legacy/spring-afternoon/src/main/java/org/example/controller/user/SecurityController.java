package org.example.controller.user;

import lombok.RequiredArgsConstructor;
import org.example.service.user.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequiredArgsConstructor
@RequestMapping("/security")
public class SecurityController {
    private final UserService userService;
    private final String context = "/security";
}
