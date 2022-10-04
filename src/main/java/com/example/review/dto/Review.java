package com.example.review.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class Review {
    private Long review_code;

    private String id;
    private String password;
    private String title;
    private String coment;
    private int score;
    private int size_evaluation;
    private int color_evaluation;
    private int fabric_evaluation;
}
