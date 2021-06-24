package org.testing.teststeps;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import java.util.Properties;

import static com.jayway.restassured.RestAssured.*;

public class HttpMethods {
	
	Properties pr;
	
	public HttpMethods(Properties pr)
	{
	this.pr = pr;	
	}
	
	public Response postRequest(String bodydata, String urikey)
	{
		
	Response res= given().
		contentType(ContentType.JSON).
		body(bodydata)
		.when().post(pr.getProperty(urikey));
	return res;
	}

	
	public Response getRequest(String urikey, String pathparameter)
	{
		String URI =  pr.getProperty(urikey) + "/" + pathparameter;
	Response res= given().
		contentType(ContentType.JSON)
		.when().get(URI);
	return res;
	}
	
	
	public Response getRequest(String urikey)
	{
		String URI =  pr.getProperty(urikey);
	Response res= given().
		contentType(ContentType.JSON)
		.when().get(URI);
	return res;
	}
	public Response putRequest(String bodydata, String urikey, String pathparameter)
	{
		String URI =  pr.getProperty(urikey) + "/" + pathparameter;
		System.out.println("URI is"+URI);
	Response res= given().
		contentType(ContentType.JSON).
		body(bodydata)
		.when().put(URI);
	return res;
	}
}
