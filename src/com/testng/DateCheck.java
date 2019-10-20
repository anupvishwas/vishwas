package com.testng;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateCheck {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String dt = "10-10-201973";
		//DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		/*sdf.setLenient(false);
		ParsePosition pos = new ParsePosition(0);
		System.out.println(sdf.parse(dt));
		System.out.println(sdf.format(sdf.parse(dt)));*/
		
	/*	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		ParsePosition pos = new ParsePosition(0);
	    sdf.setLenient(false);
	    Date retDate = sdf.parse(dt, pos);
	    if (retDate == null || pos.getIndex() != dt.length()) {
	        System.out.println("not valid");
	    } else {
	        System.out.println("ye valid");
	    }
*/
		
		/*try {
            DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yy");
            System.out.println(formatter.parseLocalDateTime(dt));
        } catch (Exception e) {
            System.out.println("catch");
        }*/
	    
		
		
	   /* try {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
	       Date date = sdf.parse(dt);
	        if (!dt.equals(sdf.format(date))) {
	            //date = null;
	        }
	        System.out.println(sdf.format(date));
	    } catch (ParseException ex) {
	        ex.printStackTrace();
	        System.out.println("catch");
	    }*/
		
		/*SimpleDateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy");
		df.setLenient(false);
        Date date=df.parse(dt);
        System.out.println(date);
		  */
	
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy");
		LocalDate date = dtf.parseLocalDate(dt);
		System.out.println(date);
	}

}
