package incubyte.tdd.kata;

import incubyte.assignment.java.LeapYear;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class LeapYearTest {

    LeapYear lp = new LeapYear();


    @Test
    public void testIsItValidYear(){
        Assert.assertEquals(true,lp.isValidYear((short)2345));
        Assert.assertEquals(false,lp.isValidYear((short)17989));
        Assert.assertEquals(false,lp.isValidYear((short)78));
        Assert.assertEquals(false,lp.isValidYear((short)0));
    }

    @Test
    public void testIsDivisibleBy4(){
        Assert.assertEquals(false,lp.isYearDivisibleBy4((short)2017));
        Assert.assertEquals(true,lp.isYearDivisibleBy4((short)2000));
        Assert.assertEquals(false,lp.isYearDivisibleBy4((short)2019));
        Assert.assertEquals(true,lp.isYearDivisibleBy4((short)2004));
        Assert.assertEquals(true,lp.isYearDivisibleBy4((short)2012));
    }

    @Test
    public void testIsDivisibleBy4ButNotBy100(){
        Assert.assertEquals(true,lp.isDivisibleYearDivisibleNotBy100By400((short)2008));
        Assert.assertEquals(false,lp.isDivisibleYearDivisibleNotBy100By400((short)1700));
        Assert.assertEquals(true,lp.isDivisibleYearDivisibleNotBy100By400((short)2012));
        Assert.assertEquals(false,lp.isDivisibleYearDivisibleNotBy100By400((short)1800));
        Assert.assertEquals(true,lp.isDivisibleYearDivisibleNotBy100By400((short)2016));
        Assert.assertEquals(false,lp.isDivisibleYearDivisibleNotBy100By400((short)1900));
    }

}