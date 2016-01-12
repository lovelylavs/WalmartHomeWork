/*----------------------------------------------------------------------------
Class name: Review
Purpose: Properties and methods for Review class 
----------------------------------------------------------------------------*/
package com.walmart.openapi.model;

import java.util.ArrayList;
import java.util.List;


public class Review {
	private String name;
	private OverallRating overallRating;
	private List<ProductAttributes> productAttributes = new ArrayList<>();;
	private String reviewer;
	private String reviewText;
	private String submissionTime;
	private String title;
	private int upVotes;
	private int downVotes;
	
public static class OverallRating{
		
		private String label;
		private Float rating;
		
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public Float getRating() {
			return rating;
		}
		public void setRating(Float rating) {
			this.rating = rating;
		}

		/*@Override
		public String toString() {
			return " {label=" + label + ", rating=" + rating + "}";
		}*/
		
	}	
	
	public static class ProductAttributes{
		
		private String label;
		private Float rating;
		
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public Float getRating() {
			return rating;
		}
		public void setRating(Float rating) {
			this.rating = rating;
		}

		/*
		@Override
		public String toString() {
			return " {label=" + label + ", rating=" + rating + "}";
		}*/
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OverallRating getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(OverallRating overallRating) {
		this.overallRating = overallRating;
	}

	public List<ProductAttributes> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttributes> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getSubmissionTime() {
		return submissionTime;
	}

	public void setSubmissionTime(String submissionTime) {
		this.submissionTime = submissionTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUpVotes() {
		return upVotes;
	}

	public void setUpVotes(int upVotes) {
		this.upVotes = upVotes;
	}

	public int getDownVotes() {
		return downVotes;
	}

	public void setDownVotes(int downVotes) {
		this.downVotes = downVotes;
	}
	
}
