package com.example.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScraper {

    public static String searchDocumentation(String query) {
        String[] docUrls = {
            "https://segment.com/docs/",
            "https://docs.mparticle.com/",
            "https://docs.lytics.com/",
            "https://docs.zeotap.com/home/en-us/"
        };

        StringBuilder results = new StringBuilder();
        boolean found = false;

        for (String url : docUrls) {
            try {
                Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0").get();
                if (doc.text().toLowerCase().contains(query.toLowerCase())) {
                    results.append("✅ Found relevant info: ").append(url).append("\n");
                    found = true;
                }
            } catch (Exception e) {
                results.append("❌ Could not fetch: ").append(url).append("\n");
            }
        }

        if (!found) {
            // Use Google Search as a fallback
            String googleSearchUrl = "https://www.google.com/search?q=site:segment.com/docs OR site:docs.mparticle.com OR site:docs.lytics.com OR site:docs.zeotap.com " + query;
            results.append("\n🔍 No direct match found. Try searching here: ").append(googleSearchUrl);
        }

        return results.toString();
    }
}
