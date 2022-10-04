package com.example.review.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReviewForm {
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
