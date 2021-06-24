package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFile {

	public static String readJson(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileInputStream fis =  new FileInputStream(f);
		JSONTokener jstkr = new JSONTokener(fis);
		JSONObject obj = new JSONObject(jstkr);
		
		return obj.toString();
	}
}
