/*----------------------------------------------------------------------------
Class name: ApiConstants
Purpose: The class holds the constants for Walmart Api
----------------------------------------------------------------------------*/
package com.walmart.openapi.utils;

public class ApiConstants {
	public static final String get ="GET";
	public static final Integer statusCode200 = 200;
	public static final Integer item10 = 10;
	public static final String apiKey = "jhbjuyhq7brpakj5rtr3xdwe";
	public static final String walmartOpenApiURL = "http://api.walmartlabs.com/v1/";
	public static final String queryParam = "<query>";
	public static final String search = walmartOpenApiURL+"search?apiKey="+apiKey+"&query="+queryParam;
	public static final String recommend = walmartOpenApiURL+"nbp?apiKey="+apiKey+"&itemId="+queryParam;
	public static final String review = walmartOpenApiURL+"reviews/"+queryParam+"?apiKey="+apiKey;
}
