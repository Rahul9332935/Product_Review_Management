package com.rahul.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.dto.ReviewDTO;
import com.rahul.exception.ProductException;
import com.rahul.exception.ProductNotFoundException;
import com.rahul.exception.ReviewException;
import com.rahul.exception.ReviewNotFoundException;
import com.rahul.model.Product;
import com.rahul.model.Review;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Long productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Long productId, Product updatedProduct) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Review createReview(Long productId, ReviewDTO reviewDto) throws ProductNotFoundException, ReviewException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReview(Long productId, Long reviewId) throws ProductNotFoundException, ReviewNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Review> getReviewsForProduct(Long productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
