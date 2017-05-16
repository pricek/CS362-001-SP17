package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	 	CalDay calDay = new CalDay();
	 	assertTrue(!calDay.isValid());
	 	assertEquals(null, calDay.iterator());
	 	assertEquals("", calDay.toString());
	 }

	 @Test
	  public void test02()  throws Throwable  {
	 	GregorianCalendar newDay = new GregorianCalendar(2017, 5, 15);
	 	CalDay calDay = new CalDay(newDay);
	 	assertEquals(0, calDay.getSizeAppts());
	 	assertEquals(15, calDay.getDay());
	 	assertEquals(5, calDay.getMonth());
	 	assertEquals(2017, calDay.getYear());
	 }

	 @Test
	  public void test03()  throws Throwable  {
		Appt appt1 = new Appt(10, 0 , 15 , 5 , 2017 , "title1", "description1");
		Appt appt2 = new Appt(5, 0 , 15 , 5 , 2017 , "title2", "description2");
		Appt appt3 = new Appt(15, 0 , 15 , 5 , 2017 , "title3", "description3");
		Appt appt4 = new Appt(10, 0 , 15 , -4 , 2017 , "title4", "description4");

		GregorianCalendar newDay = new GregorianCalendar(2017, 5, 15);
		CalDay calDay = new CalDay(newDay);
		calDay.addAppt(appt1);
		calDay.addAppt(appt2);
		calDay.addAppt(appt3);
		calDay.addAppt(appt4);
		assertEquals(3, calDay.getSizeAppts());
		assertEquals("\t --- 5/15/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t5/15/2017 at 5:0am ,title2, description2\n" +
				" \t5/15/2017 at 10:0am ,title1, description1\n" +
				" \t5/15/2017 at 3:0pm ,title3, description3\n" +
				" \n",calDay.toString());
	 }


}
