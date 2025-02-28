package com.example.service;


import com.example.util.WebScraper;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
    public String getAnswer(String question) {
        return WebScraper.searchDocumentation(question);
    }
}
