package com.walmart.openapi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import com.walmart.openapi.model.SearchResponse;
import com.walmart.openapi.service.impl.WalmartServiceImpl;

public class WalmartSearchTest {

	@Test
	public void test() {
		
		WalmartServiceImpl testService = new WalmartServiceImpl();
		SearchResponse searchResponse = testService.getSearchByQuery("lubriderm");

		assertThat(searchResponse, notNullValue());
		System.out.println(searchResponse.getItems().get(0).getItemId().toString());
		// Check the first item from search request
		assertThat(searchResponse.getItems().get(0).getItemId().toString(), equalTo("14967680"));
	}

}
