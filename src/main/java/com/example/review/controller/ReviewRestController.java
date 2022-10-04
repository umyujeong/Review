package com.example.review.controller;

import com.example.review.dto.Review;
import com.example.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReviewRestController {
    private final ReviewService reviewService;


    /*리뷰등록*/
    @RequestMapping(value = "/reviewDto", method = RequestMethod.POST)
    public Review dataSend(ReviewForm form){
        Review review =new Review();
        review.setId(form.getId());
        review.setPassword(form.getPassword());
        review.setTitle(form.getTitle());
        review.setComent(form.getComent());
        review.setScore(form.getScore());
        review.setSize_evaluation(form.getSize_evaluation());
        review.setColor_evaluation(form.getColor_evaluation());
        review.setFabric_evaluation(form.getFabric_evaluation());
        reviewService.save(review);
        return review;
    }

    /* 조회 */



}
