/*----------------------------------------------------------------------------
Class name: Item
Purpose: Properties and methods for Item class 
----------------------------------------------------------------------------*/

package com.walmart.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
	private Integer itemId;     

	private Integer parentItemId;

	private String name;

	private Double salePrice;    

	private String upc;

	private String categoryPath;

	private String shortDescription;

	private String longDescription; 

	private String thumbnailImage;    

	private String productTrackingUrl;    

	private Double standardShipRate;    

	private Boolean marketplace;    

	private String modelNumber;    

	private String productUrl;   

	private String customerRating;   

	private Integer numReviews;   

	private String customerRatingImage;    

	private String categoryNode;    

	private Boolean bundle;    

	private String addToCartUrl;    

	private String affiliateAddToCartUrl;

	private Boolean availableOnline;    

	private Double msrp;  

	private Boolean seeDetailsInCart;

	private String stock;    

	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public Integer getParentItemId() {
		return parentItemId;
	}


	public void setParentItemId(Integer parentItemId) {
		this.parentItemId = parentItemId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalePrice() {
		return salePrice;
	}


	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
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


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


	public String getThumbnailImage() {
		return thumbnailImage;
	}


	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}


	public String getProductTrackingUrl() {
		return productTrackingUrl;
	}


	public void setProductTrackingUrl(String productTrackingUrl) {
		this.productTrackingUrl = productTrackingUrl;
	}


	public Double getStandardShipRate() {
		return standardShipRate;
	}


	public void setStandardShipRate(Double standardShipRate) {
		this.standardShipRate = standardShipRate;
	}


	public Boolean getMarketplace() {
		return marketplace;
	}


	public void setMarketplace(Boolean marketplace) {
		this.marketplace = marketplace;
	}


	public String getModelNumber() {
		return modelNumber;
	}


	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}


	public String getProductUrl() {
		return productUrl;
	}


	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}


	public String getCustomerRating() {
		return customerRating;
	}


	public void setCustomerRating(String customerRating) {
		this.customerRating = customerRating;
	}


	public Integer getNumReviews() {
		return numReviews;
	}


	public void setNumReviews(Integer numReviews) {
		this.numReviews = numReviews;
	}


	public String getCustomerRatingImage() {
		return customerRatingImage;
	}


	public void setCustomerRatingImage(String customerRatingImage) {
		this.customerRatingImage = customerRatingImage;
	}


	public String getCategoryNode() {
		return categoryNode;
	}


	public void setCategoryNode(String categoryNode) {
		this.categoryNode = categoryNode;
	}


	public Boolean getBundle() {
		return bundle;
	}


	public void setBundle(Boolean bundle) {
		this.bundle = bundle;
	}


	public String getAddToCartUrl() {
		return addToCartUrl;
	}


	public void setAddToCartUrl(String addToCartUrl) {
		this.addToCartUrl = addToCartUrl;
	}


	public String getAffiliateAddToCartUrl() {
		return affiliateAddToCartUrl;
	}


	public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
		this.affiliateAddToCartUrl = affiliateAddToCartUrl;
	}


	public Boolean getAvailableOnline() {
		return availableOnline;
	}


	public void setAvailableOnline(Boolean availableOnline) {
		this.availableOnline = availableOnline;
	}


	public Double getMsrp() {
		return msrp;
	}


	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}


	public Boolean getSeeDetailsInCart() {
		return seeDetailsInCart;
	}


	public void setSeeDetailsInCart(Boolean seeDetailsInCart) {
		this.seeDetailsInCart = seeDetailsInCart;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String stock) {
		this.stock = stock;
	}
}
