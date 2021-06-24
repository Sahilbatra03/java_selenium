package org.testing.utilities;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonParsingUsingOrgJson {

	public static String jsonParse(String data , String extractKey)
	{
		if(data.startsWith("{"))
		{
			
			JSONObject js = new JSONObject(data);
		return	js.getString(extractKey);
		}
		return extractKey;
		
	}
	
	
	public static String jsonvReplace(String data , String variablename, String variablevalue)
	{
		JSONObject js = new JSONObject(data);
		js.put(variablename, variablevalue);
		System.out.println("json object after replacement"+ js.toString());
		return js.toString();
	}
	

}
