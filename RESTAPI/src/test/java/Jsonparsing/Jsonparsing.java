package Jsonparsing;

import io.restassured.path.json.JsonPath;

public class Jsonparsing {

	public static JsonPath parsing(String response)
	{
		JsonPath js = new JsonPath(response);
		
		return js;
	}
}
