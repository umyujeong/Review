package com.example.review.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReviewAvgResponse {
    private Float sizeAvg;
    private Float colorAvg;
    private Float fabricAvg;

}
