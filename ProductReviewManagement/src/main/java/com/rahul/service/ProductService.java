package com.rahul.service;

import java.util.List;

import com.rahul.dto.ReviewDTO;
import com.rahul.exception.ProductException;
import com.rahul.exception.ProductNotFoundException;
import com.rahul.exception.ReviewException;
import com.rahul.exception.ReviewNotFoundException;
import com.rahul.model.Product;
import com.rahul.model.Review;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product) throws ProductException;

    List<Product> getAllProducts();

    Product getProductById(Long productId) throws ProductNotFoundException;

    Product updateProduct(Long productId, Product updatedProduct) throws ProductNotFoundException;

    void deleteProduct(Long productId) throws ProductNotFoundException;

    Review createReview(Long productId, ReviewDTO reviewDto) throws ProductNotFoundException, ReviewException;

    void deleteReview(Long productId, Long reviewId) throws ProductNotFoundException, ReviewNotFoundException;

	List<Review> getReviewsForProduct(Long productId)throws ProductNotFoundException;
}

