package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class JsonParsingUsingJsonPath {

	
	public static String parseUsingJson(Response res, String jsonpath)
	{
		return res.jsonPath().get(jsonpath);
		
	}
}
