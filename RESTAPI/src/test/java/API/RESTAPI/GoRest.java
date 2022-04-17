package API.RESTAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import Payload.goRest;

public class GoRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RestAssured.baseURI = "https://gorest.co.in/";
		String res = given().log().all().header("Content-Type","application/json").header("Authorization","Bearer b21acbd082ce1d645bbc33cb708dd77033da0f5ed9089a3a5f940688a78bc731")
		.body(goRest.goRestpayload())
		.when().post("/public/v2/users").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println(res);
		
		JsonPath js = new JsonPath(res);
		int id = js.getInt("id");
		String name = js.getString("name");
		
		System.out.println(name);
		RestAssured.baseURI = "https://gorest.co.in/";
		String resp = given().log().all().header("Content-Type","application/json").header("Accept", "application/json")
				.header("Authorization","Bearer b21acbd082ce1d645bbc33cb708dd77033da0f5ed9089a3a5f940688a78bc731")
		.when().get("/public/v2/users/"+id).then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(resp);
	}

}
