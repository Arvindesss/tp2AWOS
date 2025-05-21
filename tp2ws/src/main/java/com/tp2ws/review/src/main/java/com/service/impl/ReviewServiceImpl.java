package com.service.impl;

import com.model.Review;
import com.repository.ReviewRepository;
import com.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    @Override
    public Review getById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }
}
