package com.example.controller;

import com.example.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    @GetMapping("/")
    public String showChatbotPage() {
        return "index"; // Loads index.html (Thymeleaf)
    }

    @PostMapping("/ask")
    @ResponseBody
    public String getChatbotResponse(@RequestParam String question) {
        String answer = chatbotService.getAnswer(question);

        if (answer == null || answer.trim().isEmpty() || answer.equalsIgnoreCase("No relevant information found.")) {
            return "Sorry, I couldn't find anything on that. Try rephrasing your question!";
        }

        return answer;
    }

}
