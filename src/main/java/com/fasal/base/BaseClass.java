package com.fasal.base;

import org.testng.annotations.BeforeClass;

import static com.fasal.utils.Constants.BASEURL;
import static io.restassured.RestAssured.baseURI;

public class BaseClass {

	@BeforeClass
	public void before() {
		baseURI = BASEURL;
	}
}
