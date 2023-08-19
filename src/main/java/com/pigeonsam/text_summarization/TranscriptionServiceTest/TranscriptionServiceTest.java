package com.pigeonsam.text_summarization.TranscriptionServiceTest;


import com.pigeonsam.text_summarization.Services.TranscriptionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranscriptionServiceTest {

    private TranscriptionService service = new TranscriptionService();

    @Test
    public void testGetSummarizedText() {
        String input = "This is a sample text.";
        String expected = "Sample text.";

        String result = service.getSummarizedText(input);

        assertEquals(expected, result);

    }

}
