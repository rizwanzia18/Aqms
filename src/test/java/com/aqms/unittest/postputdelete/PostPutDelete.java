package com.aqms.unittest.postputdelete;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PostPutDelete {
  @Test
  public void post() {
	  
	  File file = new File("src/main/resources/post.json");
	  
	  given()
	       .baseUri("http://localhost:8080")
	       .contentType(ContentType.JSON)
	       .body(file).
	  when()
	       .post("/floors").
	  then()
	       .statusCode(200);
  }
  
  @Test
  public void put() {
	  
	  File file = new File("src/main/resources/post.json");
	  
	  given()
	       .baseUri("http://localhost:8080")
	       .contentType(ContentType.JSON)
	       .body(file).
	  when()
	       .put("/floors/1").
	  then()
	       .statusCode(200);
  }
  
	@Test
	public void delete() {

		given()
		      .baseUri("http://localhost:8080").
		when()
		      .delete("/floors/10").
		then()
		      .statusCode(200);
	}
}
