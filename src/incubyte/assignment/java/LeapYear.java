package incubyte.assignment.java;

import java.util.Calendar;

public class LeapYear {


    public boolean isLeapYear(short year){
        if(isValidYear(year)){
            if(isLeapYearAccordingToJulianCalender(year)){
                return true;
            }else return false;
        }else return false;
    }

    public boolean isValidYear(short year){
        short count = 0;
        while(year!=0){
            year/=10;
            ++count;
        }
        System.out.println(count);
        if(count==4) return true;
        else return false;
    }

    public boolean isLeapYearAccordingToJulianCalender(short year){
        if(year % 4 == 0) return true;
        else return false;
    }



}
