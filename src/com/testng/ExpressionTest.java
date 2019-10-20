package com.testng;

import java.io.File;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ExpressionTest {

	public static void main(String[] args)throws Exception {
		//String str = "<p>"
		//		+ "${treatmentSheet!}";
		File file = new File("/Users/anupvishwas/Desktop/templatecontent");
		FileReader fileReader = new FileReader(file);
		StringBuilder builder = new StringBuilder();
		int i =0;
		while ((i=fileReader.read()) != -1) {
			builder.append((char)i);
		}
		Pattern pattern = Pattern.compile(".*\\$\\s*\\{\\s*treatmentSheet\\s*!?\\s*\\}.*");
		
		//Matcher matcher = pattern.matcher(str);
		String str = builder.toString();
		
		//System.out.println(matcher);
		//System.out.println(str.matches("^\\$\\s*\\{\\s*\\s*!?\\s*\\}\\$"));

		// System.out.println(str.matches(".*\\$\\s*\\{\\s*treatmentSheet\\s*!?\\s*\\}.*"));
		System.out.println(pattern.matcher(str).find());

	}

}
