
import java.util.*;
public class TestTime
{
  public static void main(String[] args)
  { GregorianCalendar time = new GregorianCalendar();
//    String s = twelveHourClock(15, 99);
    String s = twelveHourClock(0, 30);
    System.out.println(s);
  }

/** twelveHourClock  converts a 24-hour-clock time into a 12-hour-clock time.
  * @param hour - the hour time, in the range 0..23
  * @param minute - the minutes time, in the range 00..59
  * @return the 12-hour-clock time, formatted as a string.  */
public static String twelveHourClock(int hour, int minute)
{ String answer;
  if ( hour < 0  ||  hour > 23  ||  minute < 0  ||  minute > 59 )
       { answer = "twelveHourClock error: " + hour + "." + minute; }
  else { String am_pm;
         int new_hour = hour;
         if ( hour < 12 )  // morning or afternoon?
              { am_pm = " a.m."; }
         else { am_pm = " p.m."; }
         if ( hour > 12 )  // hours 13..23 are reduced by 12
            { new_hour = new_hour - 12; }
         // finally, assemble the answer, a string, from its components:
         answer = new_hour + ":";
         if ( minute < 10 )  // display minutes  0..9  as  00..09
            { answer = answer + "0"; }
         answer = answer + minute + am_pm;
       }
  return answer;
}


}

