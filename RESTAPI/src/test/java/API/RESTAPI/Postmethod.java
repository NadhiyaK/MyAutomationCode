package API.RESTAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;import javax.xml.crypto.Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Jsonparsing.Jsonparsing;
import Payload.Payload;



public class Postmethod {

	@Test(dataProvider="datadetails")
	public static void apitesting(String name,String job) {
//
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("/Users/nkarunakaran/Documents/Selenium/RESTAPI/src/test/java/data.properties");
//		prop.load(fis);
		RestAssured.baseURI="https://reqres.in/";
		
		
		String response = given().log().all().header("content-ty[e", "application.json").body(Payload.payload(name, job))
		.when().post("/api/users").then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath res = Jsonparsing.parsing(response);
		
		String createdat = res.getString("createdAt");
		System.out.println((String)createdat);
		
		//getapi
		
		
		String getres = given().queryParam("page", "2").when().get("/api/users")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath gs = Jsonparsing.parsing(getres);
		int size = gs.getInt("data.size()");
		for(int i = 0; i<size; i++)
		{
			String firstname = gs.getString("data["+i+"].first_name");
			System.out.println(firstname);
			if(firstname.equalsIgnoreCase("Lindsay"))
			{
				
				System.out.println(gs.get("data["+i+"].avatar").toString());
			}
			
		}
		
		System.out.println("The count of the data is " +size);
		
	}
	@DataProvider(name="datadetails")
	public static Object[][] dataparameter()
	{
		Object[][] details = {{"Testing1","IT"},{"Testing2","Job2"},{"Testing3","Job3"},{"Testing4","Job4"},{"Testing5","Job5"}};
		return details;
	}

	}
