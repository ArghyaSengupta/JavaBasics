package java8;
// Java code for period and duration
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Duration;
import java.time.Period;
 
public class Gap {
 
    public static void checkingPeriod()
    {
        LocalDate date1 = LocalDate.now();
 
        LocalDate date2 =
            LocalDate.of(2014, Month.DECEMBER, 12);
 
        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates "+
                           "is a period of "+gap);
}
 
    // Function to check duration
    public static void checkingDuration()
    { 
 
        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " +
                            time1);
 
        Duration fiveHours = Duration.ofHours(5);
 
        // adding five hours to the current
        // time and storing it in time2
        LocalTime time2 = time1.plus(fiveHours);
 
        System.out.println("after adding five hours " +
                           "of duration " + time2);
 
        Duration gap = Duration.between(time2, time1);
        System.out.println("duration gap between time1" +
                           " & time2 is " + gap);
}
 
    // Driver code
    public static void main(String[] args)
    {
        checkingPeriod();
        checkingDuration();
    }
}