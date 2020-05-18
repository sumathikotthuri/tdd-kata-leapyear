package incubyte.tdd.kata;

import incubyte.assignment.java.LeapYear;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class LeapYearTest {

    LeapYear lp = new LeapYear();

    @Test
    public void testIsYearAValidNumber(){

         Assert.assertEquals(true,lp.isValidYear(2345));
    }
}