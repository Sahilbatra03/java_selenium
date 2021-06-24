package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2_GetRequest {

	@Test
	public static void TC2() throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFile.readProperties("../APIAutomationFW/URI.properties");
			HttpMethods http = new HttpMethods(pr);
Response res =	http.getRequest("QA_URI",TC1_PostRequest.responseIdValue);
 	


System.out.println("Response code is" + res.getStatusCode());
	
		
		
	}

}
