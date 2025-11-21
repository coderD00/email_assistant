package com.email.emailweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.email.emailweb.Model.EmailRequest;
import com.email.emailweb.Service.EmailService;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmailRestController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/generate")
    public Map<String, String> generate(@RequestBody EmailRequest req) {
        String email = emailService.generateEmail(
                req.getCategory(),
                req.getPurpose(),
                req.getRecipient()
        );

        return Map.of("email", email);
    }
}
