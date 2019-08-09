package com.bridgelab.programming.oops.stock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class UpdateStockAccount {
	ObjectMapper mapper = new ObjectMapper();
	List<StockAccount> accountList = new ArrayList<StockAccount>();

	public void addToJson(List<StockAccount> accountObject)
			throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writeValue(new File("C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\src\\account.json"),
				accountObject);
		{

		};
		File file = new File("C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\src\\account.json");
		TypeReference<List<StockAccount>> typereference = new TypeReference<List<StockAccount>>() {
		};
	
	}
	public List<StockAccount> readFromJson() {
	
		
		List<StockAccount> list = mapper.readValue(file,typereference);
		return list;
	}
	
}
