package com.bridgelab.programming.objectorientedprogram.jsoninventory;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;

public class DataManagement {
	public static void main(String args[]) {

		JSONObject product1 = new JSONObject();
		product1.put("Name", "Rice");
		product1.put("rate", "20rup/kg");
		product1.put("amount","20kg");

		JSONObject product1Object = new JSONObject();
		product1Object.put("Rice", product1);

		JSONObject product2 = new JSONObject();
		product2.put("Name", "Pulse");
		product2.put("rate", "30rup/kg");
		product2.put("amount", "30 kg");

		JSONObject product2Object = new JSONObject();
		product2Object.put("pulse", product2);

		JSONObject product3 = new JSONObject();
		product3.put("name", "Wheat");
		product3.put("rate", "40rup/kg");
		product3.put("amount", "50 kg");

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

}
