/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 01:19:17 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CalDay_ESTest extends CalDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(1, 600, 1, (-1810), 600, "", "");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(764, 43, 1, 1, 1, (String) null, "");
      linkedList0.add(appt1);
      Appt appt2 = new Appt(1, 1, 1, 1, 600, " --- -------- Appointments ------------ --- \n", (String) null);
      calDay0.addAppt(appt2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(1, 600, 1, (-1810), 600, "", "");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(1, 1, 1, 1, 600, " --- -------- Appointments ------------ --- \n", (String) null);
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt((-1725), 43, 1, 1, 1, (String) null, "");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(1, 1, 1, 1, 600, "", (String) null);
      linkedList0.push(appt0);
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.iterator();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) zoneInfo0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.year = (-1121);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) zoneInfo0);
      CalDay calDay1 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay1.getAppts();
      calDay0.appts = linkedList0;
      calDay0.appts.add((Appt) null);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-1213);
      calDay0.month = 1;
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-1170);
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, (-1977));
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      int int0 = calDay0.getDay();
      assertEquals(3, int0);
      assertEquals(8, calDay0.getMonth());
      assertEquals(6, calDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = 3288;
      calDay0.day = (-1848);
      int int0 = calDay0.getDay();
      assertEquals((-1848), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(1, 1, 1, 1, 1, "", (String) null);
      calDay0.addAppt(appt0);
      LinkedList<Appt> linkedList1 = calDay0.getAppts();
      assertSame(linkedList1, linkedList0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      mockGregorianCalendar0.set(0, 291);
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         assertThrownBy("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getYear();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getMonth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      boolean boolean0 = calDay0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) zoneInfo0);
      CalDay calDay1 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay1.getAppts();
      calDay0.appts = linkedList0;
      calDay0.appts.add((Appt) null);
      String string0 = calDay1.toString();
      assertEquals("\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \nnull \n", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Iterator<?> iterator0 = calDay0.iterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(0, 0, 0, 0, 124, (String) null, "\t --- 1/14/2014 --- \n --- -------- Appointments ------------ --- \nnull \n");
      calDay0.addAppt(appt0);
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try { 
        calDay0.getSizeAppts();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(1, 1, 1, 1, 600, "", (String) null);
      // Undeclared exception!
      try { 
        calDay0.addAppt(appt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      String string0 = calDay0.toString();
      assertEquals("", string0);
  }
}
