package com.pigeonsam.text_summarization.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
public class Transcription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transcriptionId;
    private String originalText;
    private String transcribedText;
    private LocalTime timestamp;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
