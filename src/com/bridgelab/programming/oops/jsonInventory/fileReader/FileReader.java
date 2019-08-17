package com.bridgelab.programming.oops.jsonInventory.fileReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.programming.oops.jsonInventory.management.DataManagement;

public class FileReader {
	public static void main(String []args) throws FileNotFoundException, IOException, ParseException {
		DataManagement data = new DataManagement();
		data.writeToJson();
		data.readToJson();

	}
}
