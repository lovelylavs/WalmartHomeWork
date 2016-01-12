/*----------------------------------------------------------------------------
Class name: Recommendation
Purpose: Properties and methods for Recommendation class 
----------------------------------------------------------------------------*/
package com.walmart.openapi.model;

import java.util.ArrayList;
import java.util.List;

import com.walmart.openapi.model.RecommendationResponse;

public class Recommendation {
	private List<RecommendationResponse> recommendationResponse = new ArrayList<RecommendationResponse>();

	public List<RecommendationResponse> getRecommendationResponse() {
		return recommendationResponse;
	}

	public void setRecommendationResponse(List<RecommendationResponse> recommendationResponse) {
		this.recommendationResponse = recommendationResponse;
	}

	public void setRecommendResponse(ArrayList<RecommendationResponse> recommendationResponse) {
		this.recommendationResponse = recommendationResponse;		
	}
}
