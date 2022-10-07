package com.example.review.controller;

import com.example.review.dto.Review;
import com.example.review.dto.ReviewAvgResponse;
import com.example.review.dto.ReviewResponse;
import com.example.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ReviewService reviewService;

    /* 홈화면 */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("form", new ReviewForm());
        return "home";
    }

    @GetMapping(value = "/reviewlist")
    public String list(Model model) {
        List<ReviewResponse> reviews = reviewService.findall();
        model.addAttribute("reviews", reviews);
        return "reviewlist";
    }

    /* size 조회 */
    @GetMapping(value = "/avg")
    public String avglist(Model model) {
        List<ReviewAvgResponse> avgs = reviewService.findSizeAvg();
        System.out.println("controller");
        for (ReviewAvgResponse reviewAvgResponse : avgs) {
            System.out.println(reviewAvgResponse.toString());
        }
        model.addAttribute("avgs", avgs);
        return "avg";
    }


}
