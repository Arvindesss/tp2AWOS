package com.dto.converter;

import com.dto.ReviewDto;
import com.model.Review;

public class ReviewToReviewDto {

    public static ReviewDto convert(Review review) {
        return ReviewDto.builder()
                .id(review.getId())
                .productId(review.getProductId())
                .subject(review.getSubject())
                .content(review.getContent())
                .author(review.getAuthor())
                .build();
    }
}
