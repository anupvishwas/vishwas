package com.testng;

import java.util.Locale;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;

public class DateParserCheck {

	public static void main(String[] args) {
		
		String dt = "20-10-2087";
/*		// only yyyy
		DateTimeParser p1 = new DateTimeFormatterBuilder()
		    // year with exactly 4 digits
		    .appendYear(4, 4).toParser();
		// yyyy-MM-dd
		DateTimeParser p2 = new DateTimeFormatterBuilder()
		    // year with exactly 4 digits
		    .appendYear(4, 4)
		    // rest of the pattern
		    .appendPattern("-MM-dd").toParser();
		// yyyy MMM
		DateTimeParser p3 = new DateTimeFormatterBuilder()
		    // year with exactly 4 digits
		    .appendYear(4, 4)
		    // rest of the pattern
		    .appendPattern(" MMM").toParser();
*/
		DateTimeParser p3 = new DateTimeFormatterBuilder()
	    // year with exactly 4 digits
	    .appendYear(4, 4)
	    // rest of the pattern
	    .appendPattern("dd-MM-yyyy").toParser();
		
		// create array with all the possible patterns
		DateTimeParser[] possiblePatterns = new DateTimeParser[] { p3 };

		DateTimeFormatter parser = new DateTimeFormatterBuilder()
		    // append all the possible patterns
		    .append(null, possiblePatterns)
		    // use the locale you want (in case of month names and other locale sensitive data)
		    .toFormatter().withLocale(Locale.ENGLISH);
		
		System.out.println(parser.parseLocalDateTime(dt));
		
	}

}
