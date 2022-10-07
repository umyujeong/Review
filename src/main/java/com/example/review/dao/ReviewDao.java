package com.example.review.dao;

import com.example.review.dto.Review;
import com.example.review.dto.ReviewAvgResponse;
import com.example.review.dto.ReviewResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDao {
    void save(Review review);
    public List<ReviewResponse> findAll();
    public List<ReviewAvgResponse> findSizeAvg();

}
