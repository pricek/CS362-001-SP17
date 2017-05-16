package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 Appt appt1 = new Appt(10, 0 , 14 , 5 , 2017 , "title1", "description1");
		 Appt appt2 = new Appt(5, 0 , 15 , 5 , 2017 , "title2", "description2");
		 Appt appt3 = new Appt(15, 0 , 16 , 5 , 2017 , "title3", "description3");
		 Appt appt4 = new Appt(20, 0 , 18 , 5 , 2017 , "title4", "description4");

		 GregorianCalendar firstDay = new GregorianCalendar(2017, 5, 15);
		 GregorianCalendar secondDay = new GregorianCalendar(2017, 5, 17);

		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 appts.add(appt1);
		 appts.add(appt2);
		 appts.add(appt3);
		 appts.add(appt4);

		 TimeTable timeTable = new TimeTable();

		 LinkedList<CalDay> createdList = timeTable.getApptRange(appts, firstDay, secondDay);
		 assertEquals("[\t --- 5/15/2017 --- \n" +
				 " --- -------- Appointments ------------ --- \n" +
				 "\t5/15/2017 at 5:0am ,title2, description2\n" +
				 " \n" +
				 ", \t --- 5/16/2017 --- \n" +
				 " --- -------- Appointments ------------ --- \n" +
				 "\t5/16/2017 at 3:0pm ,title3, description3\n" +
				 " \n" +
				 "]", createdList.toString());
	 }

	@Test
	  public void test02()  throws Throwable  {
		Appt appt1 = new Appt(10, 0 , 14 , 5 , 2017 , "title1", "description1");
		Appt appt2 = new Appt(5, 0 , 15 , 5 , 2017 , "title2", "description2");
		Appt appt3 = new Appt(15, 0 , 16 , 5 , 2017 , "title3", "description3");
		Appt appt4 = new Appt(20, 0 , 18 , 5 , 2017 , "title4", "description4");
		Appt appt5 = null;

		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4);
		LinkedList<Appt> appts2 = null;

		TimeTable timeTable = new TimeTable();
		assertEquals("[\t5/14/2017 at 10:0am ,title1, description1\n" +
				", \t5/15/2017 at 5:0am ,title2, description2\n" +
				", \t5/16/2017 at 3:0pm ,title3, description3\n" +
				", \t5/18/2017 at 8:0pm ,title4, description4\n" +
				"]", appts.toString());
		timeTable.deleteAppt(appts, appt1);
		assertEquals("[\t5/15/2017 at 5:0am ,title2, description2\n" +
				", \t5/16/2017 at 3:0pm ,title3, description3\n" +
				", \t5/18/2017 at 8:0pm ,title4, description4\n" +
				"]", appts.toString());
		assertEquals(null, timeTable.deleteAppt(appts2, appt1));
		assertEquals(null, timeTable.deleteAppt(appts, appt5));

	 }

	@Test
	public void test03()  throws Throwable  {
		Appt appt1 = new Appt(10, 0 , 14 , 5 , 2017 , "title1", "description1");
		Appt appt2 = new Appt(5, 0 , 15 , 5 , 2017 , "title2", "description2");
		Appt appt3 = new Appt(15, 0 , 16 , 5 , 2017 , "title3", "description3");
		Appt appt4 = new Appt(20, 0 , 18 , 5 , 2017 , "title4", "description4");

		GregorianCalendar firstDay = new GregorianCalendar(2017, 5, 15);
		GregorianCalendar secondDay = new GregorianCalendar(2017, 5, 17);

		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4);

		TimeTable timeTable = new TimeTable();
		boolean success = false;
		try{
			timeTable.getApptRange(appts, secondDay, firstDay);
		} catch(IllegalArgumentException e){
			success = true;
		}
		assertTrue(success);
	}

}
