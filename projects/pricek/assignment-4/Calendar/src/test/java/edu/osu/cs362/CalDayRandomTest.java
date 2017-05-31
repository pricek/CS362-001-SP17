package edu.osu.cs362;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed =System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 int startDay=10;
			 int startMonth=4;
			 int startYear=2017;

			 int numberOfAppts = ValuesGenerator.getRandomIntBetween(random, 5,15);

			 GregorianCalendar newDay = new GregorianCalendar(startYear, startMonth, startDay);
			 CalDay calDay = new CalDay(newDay);

			 for(int i = 0; i < numberOfAppts; i++) {

				 int randMinute = ValuesGenerator.getRandomIntBetween(random, -30, 90);
				 int randHour = ValuesGenerator.getRandomIntBetween(random, -12, 36);
				 int randDay = ValuesGenerator.getRandomIntBetween(random, -15, 45);
				 int randMonth = ValuesGenerator.getRandomIntBetween(random, -6, 18);
				 int randYear = ValuesGenerator.getRandomIntBetween(random, 0, 5000);
				 String randTitle = ValuesGenerator.getString(random);
				 String randDescription = ValuesGenerator.getString(random);

				 Appt newAppt = new Appt(randHour, randMinute, randDay, randMonth, randYear, randTitle, randDescription);

				 int previousLength = calDay.getSizeAppts();
				 calDay.addAppt(newAppt);

				 if (newAppt.getValid()) {
					 assertTrue(previousLength + 1 == calDay.getSizeAppts());
				 } else {
					 assertTrue(previousLength == calDay.getSizeAppts());
				 }
			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if((iteration%10000)==0 && iteration!=0 )
				 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		 }


		 System.out.println("Done testing...");
		 
	 }


	
}
