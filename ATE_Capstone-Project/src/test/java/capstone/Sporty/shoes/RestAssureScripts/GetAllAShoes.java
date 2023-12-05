package capstone.Sporty.shoes.RestAssureScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllAShoes {
	@Test
	public void get_all_shoes()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
	}

	@Test
	public void get_all_users()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.log()
		.all();
	}
}

