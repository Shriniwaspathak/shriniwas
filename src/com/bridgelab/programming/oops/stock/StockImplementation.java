package com.bridgelab.programming.oops.stock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockImplementation {
	ObjectMapper mapper = new ObjectMapper();
	List<StockPortfolio> stocklist = new ArrayList<StockPortfolio>();

	public void addToJson(List<StockPortfolio> stockObject)
			throws JsonGenerationException, JsonMappingException, IOException {

		mapper.writeValue(new File("C:\\Users\\Shriniwas Pathak\\Desktop\\stock.json"), stockObject);
	}

	File file = new File("C:\\Users\\Shriniwas Pathak\\Desktop\\stock.json");
	TypeReference<List<StockPortfolio>> typereference = new TypeReference<List<StockPortfolio>>() {
	};

	public List<StockPortfolio> readFromJson() throws JsonParseException, JsonMappingException, IOException {
		List<StockPortfolio> list = mapper.readValue(file, typereference);
		return list;
	}
}