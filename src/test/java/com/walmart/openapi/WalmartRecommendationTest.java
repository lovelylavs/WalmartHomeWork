package com.walmart.openapi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.walmart.openapi.model.Item;
import com.walmart.openapi.model.RecommendationResponse;
import com.walmart.openapi.model.ReviewResponse;
import com.walmart.openapi.service.impl.WalmartServiceImpl;

public class WalmartRecommendationTest {

	@Test
	public void test() {
WalmartServiceImpl testService = new WalmartServiceImpl();
		
		List<Item> recommendResponse = testService.getRecommendationByItemId("14967680");
		assertThat(recommendResponse, notNullValue());
		System.out.println(recommendResponse.get(0).getNumReviews());
		assertThat(recommendResponse.get(0).getNumReviews().toString(), equalTo("1988"));
	}

}
