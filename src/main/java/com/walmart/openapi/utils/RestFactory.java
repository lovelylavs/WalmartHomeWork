/*----------------------------------------------------------------------------
Class name: RestFactory
Purpose: The REST client for Walmart Api
----------------------------------------------------------------------------*/
package com.walmart.openapi.utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestFactory {
	//getTokenRequest
	public String getTokenRequest(String urlConnect) {
		StringBuilder response = new StringBuilder();
		try {

			URL url = new URL(urlConnect);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(ApiConstants.get);
			connection.setRequestProperty("Accept", "application/json");
			
			if (connection.getResponseCode() != ApiConstants.statusCode200) {
				throw new RuntimeException("Failed : Please refer HTTP error code : "
						+ connection.getResponseCode());
			}

			BufferedReader bReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            String line;
            while ((line = bReader.readLine()) != null) {
                response.append(line + "\n");
            }
            bReader.close();
            connection.disconnect();            

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
        return response.toString();
	}
}
