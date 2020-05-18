package incubyte.assignment.java;

import java.util.Calendar;

public class LeapYear {


    public boolean isLeapYear(short year){
        if(isValidYear(year)){
            if(isYearDivisibleBy4(year)){
                return true;
            }else{
                if(isDivisibleYearDivisibleNotBy100By400(year)){
                    return true;
                }else return false;
            }
        }else return false;
    }

    public boolean isValidYear(short year){
        short count = 0;
        while(year!=0){
            year/=10;
            ++count;
        }
        System.out.println("count="+count);
        if(count==4) return true;
        else return false;
    }

    public boolean isDivisibleYearDivisibleNotBy100By400(short year){
        if(!isYearDivisibleBy100(year)){
            return true;
        }else if(isYearDivisibleBy400(year)){
            return true;
        }else  return false;

    }

    public boolean isYearDivisibleBy4(short year){
        System.out.println("year%4="+(year % 4));
        if(year % 4 == 0) return true;
        else return false;
    }

    public boolean isYearDivisibleBy100(short year){
        System.out.println("year%100="+(year % 100));
        if(year % 100 == 0){
            return true;
        } else return false;
    }

    public boolean isYearDivisibleBy400(short year){
        System.out.println("year%400="+(year % 400));
        if(year % 400 == 0){
            return true;
        } else return false;
    }




}
