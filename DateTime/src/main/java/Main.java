
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */

public class Main {
    
    public static void main(String[] args) {
        
        /*
            DateTime API - Question 1
                Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds? 
                    LocalDateTime
        */
        LocalDateTime birthDay = LocalDateTime.of(1989,3,29,10,54,00,00);
        
        /*
            DateTime API - Question 2
                Given a random date, how would you find the date of the previous Thursday? 
        */
        String prevThursday = "";
        LocalDate date;
        // date = LocalDate.now();
        date = LocalDate.of( 2015 , 6 , 7 );
        
       // System.out.println(date);
     
        switch(date.getDayOfWeek()){
            
            case FRIDAY: prevThursday = date.minusDays(1).toString(); break;
            
            case SATURDAY: prevThursday = date.minusDays(2).toString(); break;
            
            case SUNDAY: prevThursday = date.minusDays(3).toString(); break;
            
            case MONDAY: prevThursday = date.minusDays(4).toString(); break;
            
            case TUESDAY: prevThursday = date.minusDays(5).toString(); break;
            
            case WEDNESDAY: prevThursday = date.minusDays(6).toString(); break;
            
              default: prevThursday = date.minusDays(7).toString();  
        };
        
        //System.out.println(prevThursday);
        
        /*
            DateTime API - Question 3
        
            What is the difference between a ZoneId and a ZoneOffset?
        
            The ZoneId is a string containing where in the world the current set time zone is.

            The ZoneOffset is an integer that is + or – how many hours from UTC time.
        */
        
        /*
            DateTime API - Question 4
            	 How would you convert an Instant to a ZonedDateTime? 
                 How would you convert a ZonedDateTime to an Instant?
        */
            Instant myInstant =  Instant.now();
            ZonedDateTime date2 = ZonedDateTime.now();
            date2 = myInstant.atZone(ZoneId.of("America/Los_Angeles"));
//            System.out.println("instant to ZonedDateTime " +date2);
//            System.out.println(myInstant);
//            
            myInstant = date2.toInstant();
//            
//            System.out.println("ZonedDateTime to instant " + myInstant);
            
        
        /*
            DateTime API - Question 5
                Write an example that, for a given year, reports the length of each month within that year.
        */
            YearMonth thisYear = YearMonth.of(2024, 1);
            for (int i = 0; i < 12; i++) {
                
               // System.out.println(thisYear.lengthOfMonth());
                thisYear = thisYear.plusMonths(1);
            }
            
        /*
            DateTime API - Question 6
               Write an example that, for a given month of the current year, lists all of the Mondays in that month.
        */
            Integer month = 1;
            Integer day = 1;
            
            LocalDate thisDate = LocalDate.of(Year.now().getValue(),month,day);
            Integer numOfMondays = 0;
            System.out.println("For the month of " + thisDate.getMonth() + " " +thisDate.getYear());
            
            System.out.println("Monday falls on the following dates");
            for (int i = 0; i < thisDate.lengthOfMonth(); i++) {
                
                if(thisDate.getDayOfWeek() == DayOfWeek.MONDAY ){
                    numOfMondays++;
                    
                  System.out.println(thisDate.getDayOfMonth());
                }
                
                thisDate = thisDate.plusDays(1);
            }
        
        /*
            DateTime API - Question 7
                Write an example that tests whether a given date occurs on Friday the 13th.
        */
            Integer year = 2022;
            month = 5;
            day = 13;
            thisDate = LocalDate.of(year,month,day);
            
            if(thisDate.getDayOfWeek() == DayOfWeek.FRIDAY && thisDate.getDayOfMonth() == day){
                System.out.println("This date is Friday the 13th");
            }else{
                System.out.println("This date is not Friday the 13th");
            }
        
    }
       
}
