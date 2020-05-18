package incubyte.tdd.kata;

import incubyte.assignment.java.LeapYear;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class LeapYearTest {

    LeapYear lp = new LeapYear();
    public final static short YEAR = 2050;

    @Test
    public void testIsItValidYear(){
         Assert.assertEquals(true,lp.isValidYear(YEAR));
    }

    @Test
    public void testIsDivisibleBy4(){
        Assert.assertEquals(true,lp.isYearDivisibleBy4(YEAR));
    }

    @Test
    public void testIsDivisibleBy4ButNotBy100(){
        Assert.assertEquals(true,lp.isDivisibleYearDivisibleBy4NotBy100(YEAR) );
    }

}