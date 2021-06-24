package org.testing.testcases;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

@Test
public class TC4_GetAllRecords {
	
	public static void TC4() throws IOException
	{
		Properties pr = PropertiesFile.readProperties("../APIAutomationFW/URI.properties");
		HttpMethods http = new HttpMethods(pr);
Response res =	http.getRequest("Dummy_URI");

JsonPath jp=  res.jsonPath();
String ids = jp.get("id");
	//String ids = JsonParsingUsingOrgJson.jsonParse(res.asString(), "id");
	System.out.println("response are"+res.asString());
	//System.out.println("ids are"+ids);
	
	}
}
