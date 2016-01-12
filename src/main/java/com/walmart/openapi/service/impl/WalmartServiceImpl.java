/*----------------------------------------------------------------------------
Class name: WalmartServiceImpl
Purpose: The implementation class for WalmartService
----------------------------------------------------------------------------*/
package com.walmart.openapi.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;


import com.walmart.openapi.model.Item;
import com.walmart.openapi.model.Recommendation;
import com.walmart.openapi.model.RecommendationResponse;
import com.walmart.openapi.model.ReviewResponse;
import com.walmart.openapi.model.SearchResponse;
import com.walmart.openapi.service.WalmartService;
import com.walmart.openapi.utils.ApiConstants;
import com.walmart.openapi.utils.RestFactory;

public class WalmartServiceImpl implements WalmartService{

    
	@Override
	//Search for products based on user-provided search string
	public SearchResponse getSearchByQuery(String query) {
		
		//Handling the Json object using Jackson library
		ObjectMapper mapper = new ObjectMapper();
		SearchResponse searchResponse = null;

		try{
			String searchParam = ApiConstants.search.replaceAll(ApiConstants.queryParam, query);

			RestFactory restConnect = new RestFactory();		

			searchResponse = mapper.readValue(restConnect.getTokenRequest(searchParam), SearchResponse.class);
		}
		catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return searchResponse;
	}

	@Override
	//use the first item in search response as input for product recommendation search
	public List<Item> getRecommendationByItemId(String itemId) {

		ObjectMapper mapper = new ObjectMapper();
		ArrayList<RecommendationResponse> recommendList = new ArrayList<>();
		Recommendation recommendations = new Recommendation();
		List<Item> listItem = new ArrayList<>();
		try{
			String recommendParam = ApiConstants.recommend.replaceAll(ApiConstants.queryParam, itemId);

			RestFactory restConnect = new RestFactory();		

			listItem = mapper.readValue(restConnect.getTokenRequest(recommendParam),TypeFactory.defaultInstance().constructCollectionType(List.class,  
					Item.class));

		}
		catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return listItem;
	}

	@Override
	//Reviews for first 10 product recommendations
	public ReviewResponse getReviewsByItemId(String itemId) {
		ObjectMapper mapper = new ObjectMapper();
		ReviewResponse reviewResponse = null;

		try{
			String searchParam = ApiConstants.review.replaceAll(ApiConstants.queryParam, itemId);

			RestFactory restConnect = new RestFactory();		

			reviewResponse = mapper.readValue(restConnect.getTokenRequest(searchParam), ReviewResponse.class);
		}
		catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return reviewResponse;
	}
}
