package com.JsonFileWriteAndReadOperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReadOperationExample {

	public static void main(String[] args) {

		JSONParser jsonParser = new JSONParser();

		FileReader fileReader;
		try {
			fileReader = new FileReader("C:\\Users\\Prakash\\eclipse-workspace\\Java_File_Handling\\src\\com\\JsonFileWriteAndReadOperation\\Prakash.json");

			Object ParsedJson_fileReader = jsonParser.parse(fileReader);

			JSONObject jsonObject = (JSONObject) ParsedJson_fileReader;

			String name = (String) jsonObject.get("Name");

			String version = (String) jsonObject.get("Version");

			JSONArray jsonarray = (JSONArray) jsonObject.get("Special Features");

			Iterator iterator = jsonarray.iterator();

			while (iterator.hasNext()) {
				System.out.println("Name is: " + name);
				System.out.println("Version is: " + version);
				System.out.println("Special Features: " + iterator.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
