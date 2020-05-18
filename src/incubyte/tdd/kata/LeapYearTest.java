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


}