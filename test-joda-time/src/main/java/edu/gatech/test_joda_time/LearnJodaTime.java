package edu.gatech.test_joda_time;

import java.util.Locale;
import org.joda.time.format.DateTimeFormat;

public class App 
{
    public static void main( String[] args )
    {    	
    	printDateTimeFormat (Locale.UK);
    	printDateTimeFormat (Locale.FRENCH);
    	printDateTimeFormat (Locale.US);
    	printDateTimeFormat (Locale.CANADA);
    }
    
    /**
     * Print out the date time format for the input locale
     * @param locale The {@link Locale}
     */
    private static void printDateTimeFormat (Locale locale) {
    	String format = DateTimeFormat.patternForStyle("S-", locale);
    	
    	System.out.println("****************************************************** ");
    	System.out.println("locale: " + locale );
    	System.out.println( "format: " + format );
    	System.out.println("java version: " + System.getProperty("java.version"));
    }
    
   /* OUTPUT:       
    ****************************************************** 
		locale: en_GB
		format: dd/MM/y
		java version: 11
		****************************************************** 
		locale: fr
		format: dd/MM/y
		java version: 11
		****************************************************** 
		locale: en_US
		format: M/d/yy
		java version: 11
		****************************************************** 
		locale: en_CA
		format: y-MM-dd
		java version: 11
		
		****************************************************** 
		locale: en_GB
		format: dd/MM/yy
		java version: 1.8.0_221
		****************************************************** 
		locale: fr
		format: dd/MM/yy
		java version: 1.8.0_221
		****************************************************** 
		locale: en_US
		format: M/d/yy
		java version: 1.8.0_221
		****************************************************** 
		locale: en_CA
		format: dd/MM/yy
		java version: 1.8.0_221
   */
}
