package incubyte.tdd.kata;

import incubyte.assignment.java.LeapYear;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class LeapYearTest {

    LeapYear lp = new LeapYear();
    public final static short YEAR = 2004;

    @Test
    public void testIsItValidYear(){
         Assert.assertEquals(true,lp.isValidYear(YEAR));
    }
    @Test
    public void testJulianCalenderLeapYear(){
        Assert.assertEquals(true,lp.isLeapYearAccordingToJulianCalender(YEAR));
    }
}