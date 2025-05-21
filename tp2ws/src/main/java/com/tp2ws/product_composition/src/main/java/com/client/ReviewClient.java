package com.client;

import com.dto.ReviewDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="review", url = "${review.url}")
public interface ReviewClient {

    @GetMapping("v1/reviews/{id}")
    ReviewDto getReviewByProductId(@PathVariable("id") Long productId);
}
