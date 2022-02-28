package API.RESTAPI;

import org.testng.annotations.Test;

import Jsonparsing.Jsonparsing;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Getfile {

	//Files is package and in which there is a method called readallBytes
	//using that we can covert the file to bytes and from bytes to string
	@Test
	public static void getfile() throws IOException
	{
		RestAssured.baseURI="https://reqres.in/";
		
		String res =	given().body(new String (Files.readAllBytes(Paths.get("/Users/nkarunakaran/Desktop/testapi.json"))))
			.when().get("/api/users").then()
			.assertThat().statusCode(200).extract().response().asString();
				
		JsonPath result = Jsonparsing.parsing(res);
		
		System.out.println(result.getString("total").toString());
	}
}
