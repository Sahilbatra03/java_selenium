package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFile;
import org.testing.utilities.RandomDataGeneration;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3_PutRequest {
	
	@Test
	public static void TC3() throws IOException {
		
		
	//	Integer n = RandomDataGeneration.randomNumber();

		Properties pr = PropertiesFile.readProperties("../APIAutomationFW/URI.properties");
		HttpMethods http = new HttpMethods(pr);
Response res =	http.getRequest("QA_URI",TC1_PostRequest.responseIdValue);

String updatedpayload = JsonParsingUsingOrgJson.jsonvReplace(res.asString(), "firstname", "Sumit"); 	
Response res1 = http.putRequest(updatedpayload, "QA_URI", TC1_PostRequest.responseIdValue);
System.out.println("Response code is" + res1.getStatusCode());

	}

}
