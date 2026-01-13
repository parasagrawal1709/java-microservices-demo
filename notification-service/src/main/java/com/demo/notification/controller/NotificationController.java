package com.demo.notification.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @GetMapping
    public String notifyUser() {
        return "Notification sent";
    }
}
