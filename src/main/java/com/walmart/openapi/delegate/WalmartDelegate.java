/*----------------------------------------------------------------------------
Class name: WalmartDelegate
Purpose: WalmartDelegate delegates the call to WalmartServiceImpl and displays 
         the ranked item recommendations  
----------------------------------------------------------------------------*/
package com.walmart.openapi.delegate;

import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.ws.http.HTTPException;

import com.walmart.openapi.model.Item;
import com.walmart.openapi.model.ReviewResponse;
import com.walmart.openapi.model.SearchResponse;
import com.walmart.openapi.service.WalmartService;
import com.walmart.openapi.service.impl.WalmartServiceImpl;
import com.walmart.openapi.utils.ApiConstants;

public class WalmartDelegate {
	public void displayRankedRecommendations(String searchQuery) throws Exception {

		try{
			WalmartService callWalmartService = new WalmartServiceImpl();
			
			//Look for items that are requested by the user in our walmart website
			SearchResponse searchResponse = callWalmartService.getSearchByQuery(searchQuery);

			//First item from search response list is used as input to get recommendations
			Item firstItem = (Item) searchResponse.getItems().get(0);

			System.out.println("Item name: " + firstItem.getName() + ", Item Id: " + firstItem.getItemId());

			//Retrieve Item recommendations as a list
			List<Item> recommendationList = callWalmartService.getRecommendationByItemId(firstItem.getItemId().toString());


			// If the list has more than 10 items, get the first 10.
			if (recommendationList.size() > ApiConstants.item10) {
				recommendationList = recommendationList.subList(0, ApiConstants.item10);
			}

			// Create a TreeMap with ReviewsReponse class as Key, Item class as Value. 
			// Add averageOverallRating value as custom Comparator to sort the TreeMap.
			TreeMap<ReviewResponse, Item> itemRatingMap = new TreeMap<ReviewResponse, Item>(
					ReviewResponse.Comparators.reviewComparator);

			System.out.println("Retrieving rank ordererd item reviews:");
			System.out.println("---------------------------------------------");

			for (Item item : recommendationList) {
				// Request Reviews API for each item itemId
				ReviewResponse reviewResponse = callWalmartService.getReviewsByItemId(item.getItemId().toString());

				//We add a reviewResponse and item to the TreeMap
				itemRatingMap.put(reviewResponse, item);
			}

			// Print the ranked product from the sorted TreeMap
			for (Map.Entry<ReviewResponse, Item> entry : itemRatingMap.entrySet()) {
				System.out.println(entry.getKey().getReviewStatistics().getAverageOverallRating().toString() + " - " + entry.getValue().getName());
			}
			System.out.println();

		} catch (HTTPException ex ){

			System.out.println("HTTP Response Code: " + ex.getStatusCode() + " " + ex.getMessage());
		}

	}
}
