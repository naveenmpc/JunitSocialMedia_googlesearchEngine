package capstone.Sporty.shoes.RestAssureScripts;



import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete_method {
	@Test(priority='1')
	public void delete_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "101")
		.when().delete()
		.then().log().all();
		
	}

}


