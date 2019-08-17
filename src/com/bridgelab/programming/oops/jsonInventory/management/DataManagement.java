package com.bridgelab.programming.oops.jsonInventory.management;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataManagement {
	Scanner sc=new Scanner (System.in);
	public  void writeToJson() {

		JSONObject product1 = new JSONObject();
		System.out.println("Enter Product Name ");
		String name=sc.next();
		product1.put("Name",name);
		System.out.println("enter the rate");
		int rate=sc.nextInt();
		product1.put("rate", rate);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		product1.put("amount", amount);

		
		JSONObject product1Object = new JSONObject();
		product1Object.put("Rice", product1);

		JSONObject product2 = new JSONObject();
		System.out.println("Enter Product Name ");
		
		String name2=sc.next();
		product2.put("Name",name);
		System.out.println("enter the rate");
		int rate2=sc.nextInt();
		product2.put("rate", rate);
		System.out.println("enter the amount");
		int amount2=sc.nextInt();
		product2.put("amount", amount);

		JSONObject product2Object = new JSONObject();
		product2Object.put("pulse", product2);

		JSONObject product3 = new JSONObject();
		System.out.print("Enter Product Name ");
		
		String name3=sc.next();
		product3.put("Name",name);
		System.out.println("enter the rate");
		int rate3=sc.nextInt();
		product3.put("rate", rate);
		System.out.println("enter the amount");
		int amount3=sc.nextInt();
		product3.put("amount", amount);
      
		JSONObject product3Object = new JSONObject();
		product3Object.put("wheat", product3);
		
		
		JSONArray productList = new JSONArray();
		productList.add(product1Object);
		productList.add(product2Object);
		productList.add(product3Object);

		try (FileWriter file = new FileWriter("C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\products.json")) {
			file.write(productList.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(product1Object);
		System.out.println(product2Object);
		System.out.println(product3Object);
	}
	public void readToJson() throws FileNotFoundException, IOException, ParseException {
		 JSONParser parser=new JSONParser();
		    try(FileReader reader=new FileReader("C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\products.json")){
		           	Object obj=parser.parse(reader);
		           	JSONArray productList=(JSONArray)obj;
		           	System.out.println(productList);
		    }    
	}

 }


