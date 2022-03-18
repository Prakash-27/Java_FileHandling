package com.JsonFileWriteAndReadOperation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWriteOperationExample {

	public static void main(String[] args) {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Selenium");
		jsonObject.put("Version", "4.1.0");

		JSONArray jsonArray = new JSONArray();
		jsonArray.add("It Support Multiple Language Binding.");
		jsonArray.add("It is a Best UI Automation Tool in the market");

		jsonObject.put("Special Features", jsonArray);

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("C:\\Users\\Prakash\\eclipse-workspace\\Java_File_Handling"
					+ "\\src\\com\\JsonFileWriteAndReadOperation\\Prakash.json");

			fileWriter.write(jsonObject.toJSONString());
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
