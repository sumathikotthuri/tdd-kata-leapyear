package incubyte.assignment.java;

import java.util.Calendar;

public class LeapYear {


    public static boolean isLeapYear(int year){
        return true;
    }

    public boolean isValidYear(int year){
        int count = 0;
        while(year!=0){
            year/=10;
            ++count;
        }
        System.out.println(count);
        if(count==4) return true;
        else return false;
    }



}
