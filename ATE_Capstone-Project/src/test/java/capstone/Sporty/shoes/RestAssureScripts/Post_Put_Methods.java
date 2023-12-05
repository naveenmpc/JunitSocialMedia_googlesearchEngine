package capstone.Sporty.shoes.RestAssureScripts;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Post_Put_Methods {
	@Test(priority='1')
	public void add_new_product()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","101")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Bata")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7,8")
		.queryParam("price", "3000")
		.when()
		.post()
		.then()
		.log().all();
		
}
	@Test(priority='2')
	public void update_a_product()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","101")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7,8")
		.queryParam("price", "2500")
		.when()
		.put()
		.then()
		.log().all();
}
}


