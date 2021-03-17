package com.fasal.test;

import com.fasal.base.BaseClass;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static com.fasal.utils.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReqresApiTestSuite extends BaseClass {
	@Test
	public void validateUserRegistrationIsSuccessful() {
		final String json = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";

		given()
				.contentType("application/json")
				.body(json)
				.when()
				.post(REGISTER_SUCCESSFUL_API)
				.then()
				.statusCode(SUCCESS_CODE)
				.contentType("application/json")
				.body("token", equalTo("QpwL5tke4Pnpja7X4"));
	}

	@Test
	public void validateUserIsCreatedSuccessfully() {
		final String json = "{\"name\": \"morpheus\", \"job\": \"leader\"}";

		given()
				.contentType("application/json")
				.body(json)
				.when()
				.post(CREATE_API)
				.then()
				.statusCode(CREATED_SUCCESS_CODE)
				.contentType("application/json")
				.body("name", equalTo("morpheus"))
				.body("job", equalTo("leader"));
	}

	@Test
	public void validateSingleUserDetailsAreFetchedSuccessfully() {
		given()
				.when()
				.get(SINGLE_USER_API)
				.then()
				.contentType(ContentType.JSON)
				.statusCode(SUCCESS_CODE)
				.body("data.first_name", equalTo("Janet"))
				.body("data.last_name", equalTo("Weaver"))
				.body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));
	}

	@Test
	public void validateListOfAllUsersIsFetchedSuccessfully() {
		given()
				.when()
				.get(LIST_USERS_API)
				.then()
				.contentType(ContentType.JSON)
				.statusCode(SUCCESS_CODE)
				.body("data[0].id", equalTo(7))
				.body("data[0].first_name", equalTo("Michael"))
				.body("data[0].last_name", equalTo("Lawson"))
				.body("data[0].avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"));
	}

	@Test
	public void validateUserDetailsIsUpdatedSuccessfully() {
		final String json = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";

		given()
				.contentType("application/json")
				.body(json)
				.when()
				.put(UPDATE_API)
				.then()
				.statusCode(SUCCESS_CODE)
				.contentType("application/json")
				.body("name", equalTo("morpheus"))
				.body("job", equalTo("zion resident"));
	}

	@Test
	public void validateUserCanBeDeletedSuccessfully() {
		given()
				.when()
				.delete(DELETE_API)
				.then()
				.statusCode(NO_CONTENT_CODE);
	}
}
