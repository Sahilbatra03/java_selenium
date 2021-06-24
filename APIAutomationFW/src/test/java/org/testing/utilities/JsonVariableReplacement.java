package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {

public static String jsonReplace(String bodydata, String variablename ,String variablevalue)
{
	 bodydata = bodydata.replaceAll(Pattern.quote("{{"+variablename+"}}"),variablevalue);
return bodydata;


}

}
