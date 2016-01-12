/*----------------------------------------------------------------------------
Class name: SearchResponse
Purpose: Properties and methods for SearchResponse class 
----------------------------------------------------------------------------*/
package com.walmart.openapi.model;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {
	private String query;
	
	private String sort;
			
	private String responseGroup;
	
	private Integer totalResults;
	
	private Integer start;
	
	private Integer numItems;
	
	private List<Item> items = new ArrayList<Item>();
	
	private List<Object> facets = new ArrayList<Object>();
	 
	
	public String getResponseGroup() {
		return responseGroup;
	}

	public void setResponseGroup(String responseGroup) {
		this.responseGroup = responseGroup;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Object> getFacets() {
		return facets;
	}

	public void setFacets(List<Object> facets) {
		this.facets = facets;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getNumItems() {
		return numItems;
	}

	public void setNumItems(Integer numItems) {
		this.numItems = numItems;
	}

	public Integer getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	
}
