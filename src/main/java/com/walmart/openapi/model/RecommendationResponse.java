/*----------------------------------------------------------------------------
Class name: RecommendationResponse
Purpose: Properties and methods for RecommendationResponse class 
----------------------------------------------------------------------------*/
package com.walmart.openapi.model;


public class RecommendationResponse {
   
    private Integer itemId;
 
    private Integer parentItemId;

    private String name;
       
    private Double msrp;
       
    private Double salePrice;
       
    private String upc;
       
    private String categoryPath;
   
    private String shortDescription;
   
    private String longDescription;
   
    private String brandName;
   
    private String thumbnailImage;
   
    private String mediumImage;
   
    private String largeImage;
   
    private String productTrackingUrl;
   
    private Boolean ninetySevenCentShipping;
   
    private Double standardShipRate;
    
    private Double twoThreeDayShippingRate;
    
    private Double overnightShippingRate;
   
    private Boolean marketplace;
   
    private Boolean shipToStore;
   
    private Boolean freeShipToStore;
   
    private String modelNumber;
   
    private String productUrl;
       
    private String customerRating;
       
    private Integer numReviews;
       
    private String customerRatingImage;
       
    private String categoryNode;
       
    private Boolean rollBack;
       
    private Boolean bundle;
       
    private Boolean clearance;
       
    private Boolean preOrder;
       
    private String stock;
   
    private Boolean availableOnline;

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

	public Double getMsrp() {
		return msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getMediumImage() {
		return mediumImage;
	}

	public void setMediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
	}

	public String getLargeImage() {
		return largeImage;
	}

	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}

	public String getProductTrackingUrl() {
		return productTrackingUrl;
	}

	public void setProductTrackingUrl(String productTrackingUrl) {
		this.productTrackingUrl = productTrackingUrl;
	}

	public Boolean getNinetySevenCentShipping() {
		return ninetySevenCentShipping;
	}

	public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping) {
		this.ninetySevenCentShipping = ninetySevenCentShipping;
	}

	public Double getStandardShipRate() {
		return standardShipRate;
	}

	public void setStandardShipRate(Double standardShipRate) {
		this.standardShipRate = standardShipRate;
	}

	public Double getTwoThreeDayShippingRate() {
		return twoThreeDayShippingRate;
	}

	public void setTwoThreeDayShippingRate(Double twoThreeDayShippingRate) {
		this.twoThreeDayShippingRate = twoThreeDayShippingRate;
	}

	public Double getOvernightShippingRate() {
		return overnightShippingRate;
	}

	public void setOvernightShippingRate(Double overnightShippingRate) {
		this.overnightShippingRate = overnightShippingRate;
	}

	public Boolean getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(Boolean marketplace) {
		this.marketplace = marketplace;
	}

	public Boolean getShipToStore() {
		return shipToStore;
	}

	public void setShipToStore(Boolean shipToStore) {
		this.shipToStore = shipToStore;
	}

	public Boolean getFreeShipToStore() {
		return freeShipToStore;
	}

	public void setFreeShipToStore(Boolean freeShipToStore) {
		this.freeShipToStore = freeShipToStore;
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

	public Boolean getRollBack() {
		return rollBack;
	}

	public void setRollBack(Boolean rollBack) {
		this.rollBack = rollBack;
	}

	public Boolean getBundle() {
		return bundle;
	}

	public void setBundle(Boolean bundle) {
		this.bundle = bundle;
	}

	public Boolean getClearance() {
		return clearance;
	}

	public void setClearance(Boolean clearance) {
		this.clearance = clearance;
	}

	public Boolean getPreOrder() {
		return preOrder;
	}

	public void setPreOrder(Boolean preOrder) {
		this.preOrder = preOrder;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Boolean getAvailableOnline() {
		return availableOnline;
	}

	public void setAvailableOnline(Boolean availableOnline) {
		this.availableOnline = availableOnline;
	}
    
    
}
