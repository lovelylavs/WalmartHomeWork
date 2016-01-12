package com.walmart.openapi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import com.walmart.openapi.model.ReviewResponse;
import com.walmart.openapi.service.impl.WalmartServiceImpl;

public class WalmartReviewTest {

	@Test
	public void test() {
		WalmartServiceImpl testService = new WalmartServiceImpl();
		
		ReviewResponse reviewResponse = testService.getReviewsByItemId("14967680");
		assertThat(reviewResponse, notNullValue());
		System.out.println(reviewResponse.getReviewStatistics().getAverageOverallRating().toString());
		assertThat(reviewResponse.getReviewStatistics().getAverageOverallRating().toString(), equalTo("4.33"));
	}

}
