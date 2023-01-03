package java8;
import java.time.*;
import java.time.format.DateTimeFormatter;
  
public class Date {
 
public static void LocalDateTimeApi()
{
  
    // the current date
    LocalDate date = LocalDate.now();
    System.out.println("the current date is "+
                        date);
  
  
    // the current time
    LocalTime time = LocalTime.now();
    System.out.println("the current time is "+
                        time);
      
  
    // will give us the current time and date
    LocalDateTime current = LocalDateTime.now();
    System.out.println("current date and time : "+
                        current);
  
  
    // to print in a particular format
    DateTimeFormatter format =
      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
   
    String formatedDateTime = current.format(format);
    
    System.out.println("in formatted manner "+
                        formatedDateTime);
  
  
    // printing months days and seconds
    Month month = current.getMonth();
    int day = current.getDayOfMonth();
    int seconds = current.getSecond();
    int hour=current.getHour();
    int year=current.getYear();
    System.out.println("Month : "+month+" day : "+
                        day+" seconds : "+seconds+" hour :"+ hour+"year :"+ year);
  
    // printing some specified date
    LocalDate date2 = LocalDate.of(1950,1,26);
    System.out.println("the republic day :"+date2);
  
    // printing date with current time.
    //current : 30-12-2022 10:06:45
    //month-12 : same
    //day: 24
    //2016
    //in 2016 , 24th december 10:06:45 : day....
    LocalDateTime specificDate =
        current.withDayOfMonth(24).withYear(2016);//
 
    System.out.println("specific date with "+
                       "current time : "+specificDate);
}
 
    // Driver code
    public static void main(String[] args)
    {
        LocalDateTimeApi();
    }
}