package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDateTimeInString {

	public static void main(String[] args) {
			String testString = "CS Exp Bootcamp (2020-03-17 at 03:40 GMT-7).mp4";
			String target = testString.replaceAll(".*(\\d{4}-\\d{2}-\\d{2}).*", "$1");
			String time = testString.replaceAll(".*(\\d{2}:\\d{2}).*", "$1");
	        
	        Pattern pattern = Pattern.compile(".(\\d{2}:\\d{2}).");
	        Matcher matcher = pattern.matcher(testString);
	        if (matcher.find())
	        	System.out.println(matcher.group(1));
	}

}
