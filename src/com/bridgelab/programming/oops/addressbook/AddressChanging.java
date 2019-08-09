package com.bridgelab.programming.oops.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


public class AddressChanging {
	
	ObjectMapper mapper = new ObjectMapper();
	List<AdressBook> book = new ArrayList<AdressBook>();
	File file = new File("C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\src\\com\\bridgelab\\programming\\oops\\addressbook\\address.json");
	TypeReference<List<AdressBook>> typereference = new TypeReference<List<AdressBook>>() {};

	public void addToJson(List<AdressBook> list)
			throws JsonGenerationException, JsonMappingException, IOException {
mapper.writeValue(file,list);
	}


	public List<AdressBook> readFromJson() throws JsonParseException, JsonMappingException, IOException {
		List<AdressBook> list = mapper.readValue(file, typereference);
		return list;
	}
	
}
