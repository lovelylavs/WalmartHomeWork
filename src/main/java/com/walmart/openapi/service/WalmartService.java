/*----------------------------------------------------------------------------
Class name: WalmartService
Purpose: The service interface for WalmartService
----------------------------------------------------------------------------*/
package com.walmart.openapi.service;


import java.util.List;

import com.walmart.openapi.model.Item;
import com.walmart.openapi.model.ReviewResponse;
import com.walmart.openapi.model.SearchResponse;

public interface WalmartService {
	public SearchResponse getSearchByQuery(String query);
	
	public List<Item> getRecommendationByItemId(String itemId);
	
	public ReviewResponse getReviewsByItemId(String itemId);
}