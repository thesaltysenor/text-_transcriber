package com.pigeonsam.text_summarization.Controllers;

import com.pigeonsam.text_summarization.Services.TranscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranscriptionController {

    @Autowired
    private TranscriptionService transcriptionService;

    @PostMapping("/summarize")
    public ResponseEntity<String> summarizeText(@RequestBody String inputText) {
        // This is where you'll integrate with OpenAI to get the summarized text

        String summarizedText = transcriptionService.getSummarizedText(inputText);
        return ResponseEntity.ok(summarizedText);
    }
}
