/*----------------------------------------------------------------------------
Class name: ReviewResponse
Purpose: Properties and methods for ReviewResponse class 
----------------------------------------------------------------------------*/
package com.walmart.openapi.model;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewResponse {
	private String itemId;
    private String name;
    private String upc;
    private String categoryPath;
    private String brandName;
	private URL productUrl;	
	private URL productTrackingUrl;	
    private String categoryNode;
    private List<Review> reviews = new ArrayList<>();
    private ReviewStatistics reviewStatistics;
    private boolean availableOnline;
    
    public static class ReviewStatistics{
    	
	private Float averageOverallRating;
	private Float overallRatingRange;
	private List<RatingDistributions> ratingDistributions = new ArrayList<>();;
	private int totalReviewCount;

	public static class RatingDistributions{
		private int count;
		private int ratingValue;
		
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public int getRatingValue() {
			return ratingValue;
		}
		public void setRatingValue(int ratingValue) {
			this.ratingValue = ratingValue;
		}
		
		@Override
		public String toString() {
			return " {count=" + count + ", ratingValue=" + ratingValue + "}";
		}
	}
	
	public Float getAverageOverallRating() {
		return averageOverallRating;
	}

	public void setAverageOverallRating(Float averageOverallRating) {
		this.averageOverallRating = averageOverallRating;
	}

	public Float getOverallRatingRange() {
		return overallRatingRange;
	}

	public void setOverallRatingRange(Float overallRatingRange) {
		this.overallRatingRange = overallRatingRange;
	}

	public int getTotalReviewCount() {
		return totalReviewCount;
	}

	public void setTotalReviewCount(int totalReviewCount) {
		this.totalReviewCount = totalReviewCount;
	}

	public List<RatingDistributions> getRatingDistributions() {
		return ratingDistributions;
	}

	public void setRatingDistributions(List<RatingDistributions> ratingDistributions) {
		this.ratingDistributions = ratingDistributions;
	}

	@Override
	public String toString() {
		return "ReviewStatistics [averageOverallRating=" + averageOverallRating + ", overallRatingRange="
				+ overallRatingRange + ", ratingDistributions=" + ratingDistributions + ", totalReviewCount="
				+ totalReviewCount + "]";
	}
	
    }

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public URL getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(URL productUrl) {
		this.productUrl = productUrl;
	}

	public URL getProductTrackingUrl() {
		return productTrackingUrl;
	}

	public void setProductTrackingUrl(URL productTrackingUrl) {
		this.productTrackingUrl = productTrackingUrl;
	}

	public String getCategoryNode() {
		return categoryNode;
	}

	public void setCategoryNode(String categoryNode) {
		this.categoryNode = categoryNode;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public ReviewStatistics getReviewStatistics() {
		return reviewStatistics;
	}

	public void setReviewStatistics(ReviewStatistics reviewStatistics) {
		this.reviewStatistics = reviewStatistics;
	}

	public boolean isAvailableOnline() {
		return availableOnline;
	}

	public void setAvailableOnline(boolean availableOnline) {
		this.availableOnline = availableOnline;
	}
	
	
	public int compareTo(ReviewResponse o) {
		return Comparators.reviewComparator.compare(this, o);
	}
	

	//Comparator is used to rank the item reviews
	public static class Comparators {
		
		/*
		  Comparator for Review Rating ranking.
		  Rank from high rating to low rating for a given item
		  If averageOverallRating field is null for an item, this review is ordered as a lower rank.
		  If averageOverallRating for both items are null or they are equal to each other, reviews are ranked in order of name.
		*/
	    public static final Comparator<ReviewResponse> reviewComparator = new Comparator<ReviewResponse>() {

			@Override
			/*res1 and res2 are objects to be compared
			This method returns 0 if both objects are equal
			Returns a positive value if res1 is greater than res2
			otherwise a negative value is returned
			*/
			public int compare(ReviewResponse res1, ReviewResponse res2) {
				
				int compare=0;
				//reviewStatistics has properties like
				//averageOverallRating overallRatingRange ratingDistributions totalReviewCount
				//Check if any of the items does not have customerRating value.
				if (res1.reviewStatistics.averageOverallRating == null || res2.reviewStatistics.averageOverallRating == null){										
					if (res1.reviewStatistics.averageOverallRating == null && res2.reviewStatistics.averageOverallRating == null){
						//order by the item name if values are null
						compare = res1.name.compareTo(res2.name);						
					} else if ( res2.reviewStatistics.averageOverallRating == null ) {
						//If res2 customerRating value is null we rank res1 first.
						compare = -1;
					} else {
						//If res1 customerRating value is null we rank res2 first.
						compare = 1;
					}
					
				} else {					
					if (Double.compare(res1.reviewStatistics.averageOverallRating, res2.reviewStatistics.averageOverallRating) == 0){
						//If both the customerRatings are equal we order by the item name.
						compare = res1.name.compareTo(res2.name);
					} else {
						//negate compare to rank from high to low.
						compare = -Float.compare(res1.reviewStatistics.averageOverallRating, res2.reviewStatistics.averageOverallRating);
					}
				}
				return compare;
			}	    	
	    };
	    
	}
}
