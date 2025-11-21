package com.email.emailweb.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * A lightweight EmailService that generates a short email locally based on the
 * provided category, purpose and recipient. This avoids external API calls and
 * keeps the project runnable out-of-the-box. If you later want to wire an LLM
 * provider, inject an HTTP client and implement the call using the configured
 * API key.
 */
@Service
public class EmailService {

    // Optional: kept so property exists if you later enable remote LLM calls.
    @Value("${openai.api.key:}")
    private String apiKey;

    public String generateEmail(String category, String purpose, String recipient) {
        String tone = "warm and family-like";
        if (category != null) {
            String c = category.trim().toLowerCase();
            if ("professional".equals(c)) tone = "formal";
            else if ("casual".equals(c)) tone = "friendly";
        }

        if (!StringUtils.hasText(recipient)) recipient = "Valued Recipient";
        if (!StringUtils.hasText(purpose)) purpose = "a quick note";

        StringBuilder out = new StringBuilder();
        out.append("Subject: ").append(capitalize(purpose)).append("\n\n");

        switch (tone) {
            case "formal" -> {
                out.append("Dear ").append(recipient).append(",\n\n");
                out.append("I hope this message finds you well. I am reaching out regarding ")
                        .append(purpose).append(".");
                out.append("\n\nPlease let me know if you need any additional information or have any questions.\n\n");
                out.append("Sincerely,\nYour Name");
            }
            case "friendly" -> {
                out.append("Hi ").append(recipient).append(",\n\n");
                out.append("Just a quick note about ").append(purpose).append(" — hope you're doing well!");
                out.append("\n\nBest,\nYour Name");
            }
            default -> {
                out.append("Hello ").append(recipient).append(",\n\n");
                out.append("I wanted to share a quick message regarding ").append(purpose).append(".");
                out.append("\n\nWarm regards,\nYour Name");
            }
        }

        return out.toString();
    }

    private String capitalize(String s) {
        if (s == null || s.isBlank()) return "";
        String trimmed = s.trim();
        return Character.toUpperCase(trimmed.charAt(0)) + trimmed.substring(1);
    }
}
