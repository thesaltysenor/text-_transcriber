package com.pigeonsam.text_summarization.Services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class TranscriptionService {

    public String getSummarizedText(String inputText) {
        String openaiApiUrl = "https://api.openai.ccom/v1/completions";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer YOU_OPENAI_API_KEY");
        headers.set("Content-Type", "application/json");

        String body = "{"
                + "\"prompt\":\"Summarize: " + inputText + "\","
                + "\"max_tokens\":150"
                + "}";

        HttpEntity<String> entity = new HttpEntity<>(body, headers);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.exchange(openaiApiUrl, HttpMethod.POST, entity, String.class).getBody();

        // TODO: Properly parse and return the summarized text from the response
        return response;
    }

}
