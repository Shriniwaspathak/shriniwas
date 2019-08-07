package com.bridgelab.programming.objectorientedprogram.jsoninventory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadFile {
	public static void main (String args[]) throws FileNotFoundException, IOException, ParseException {
	    JSONParser parser=new JSONParser();
	    try(FileReader reader=new FileReader("C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\products.json")){
	           	Object obj=parser.parse(reader);
	           	JSONArray productList=(JSONArray)obj;
	           	System.out.println(productList);
	         
	           	
	    }
	    		
	}
   public static void parseProductObject(JSONObject product) {
	   JSONObject productObject=(JSONObject)product.get("product");
	   
	   String name = (String) productObject.get("name");   
       System.out.println(name);
       
       String rate = (String) productObject.get("rate");   
       System.out.println(rate);
       
       String amount = (String) productObject.get("amount");   
       System.out.println(amount);
       
       
	   
   }
}
