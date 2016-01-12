/*----------------------------------------------------------------------------
Class name: WalmartConsumer
Purpose: WalmartConsumer is the main entry point into the WalmartAPIDemo Application 
----------------------------------------------------------------------------*/
package com.walmart.openapi.client;

import java.net.URI;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.walmart.openapi.delegate.WalmartDelegate;

public class WalmartConsumer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String query = new String();

		System.out.println("Please enter a product to search in Walmart or type 'exit' to exit:");
		System.out.println("Usage: <Product Name>");
		// Call to the class where we have implemented the function to display
		// ranked recommendations
		WalmartDelegate walmartDelegate = new WalmartDelegate();

		try {
			while (!scanner.hasNext("exit")) {
				query = scanner.nextLine();
				
				if (query.equals("")) {
					System.out.println("You have entered an Invaild input, please search again:");
				} else if (query.length() >= 1) {
					// We call the function to get our ranked recommendations
					URI uri = new URI(query.replace(" ", "%20"));
					walmartDelegate.displayRankedRecommendations(uri.toString());

					System.out.println();
					System.out.println("Please enter a product to search again in Walmart or type 'exit' to exit:");
				} else {
					System.out.println("Invaild input, please search again:");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invaild input, please search again:");
		} catch (Exception e) {
			System.out.println("An error has ocurred. Please contact the administrator:");
		}
		scanner.close();
	}
}
