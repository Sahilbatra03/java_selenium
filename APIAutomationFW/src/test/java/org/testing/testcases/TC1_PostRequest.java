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

public class TC1_PostRequest {
	static String responseIdValue;
	
	@Test
	public static void TC1() throws IOException {
		// TODO Auto-generated method stub
 
		Integer n = RandomDataGeneration.randomNumber();

		Properties pr = PropertiesFile.readProperties("../APIAutomationFW/URI.properties");
		String requestpayload =  JsonFile.readJson("../APIAutomationFW/src/test/java/org/testing/resources/BodyData.json");
		requestpayload = JsonVariableReplacement.jsonReplace(requestpayload, "id", n.toString());
		HttpMethods http = new HttpMethods(pr);
Response res =	http.postRequest(requestpayload, "QA_URI");
responseIdValue = JsonParsingUsingOrgJson.jsonParse(res.asString(), "id"); 	

System.out.println("Response code is" + responseIdValue);
	
	}

}
