import java.util.Date;
import java.text.SimpleDateFormat; //if you have to format in hours mins secs
import java.text.DateFormat;
import java.util.Calendar;
//calendar, homework to play around with it

public class DateCalendar {
public static void main(String[] args) {
	//defaul is todays date
	Date date = new Date();
	DateFormat format = new SimpleDateFormat("HH:MM");
	System.out.println(format.format(date));
	System.out.println(date.getHours()); //means its depreicated aka newer versions do not have it
	System.out.println(date.getTime()); //it prints milliseconds since midnight January 1st, 1970
	System.out.println();
	
	
	 Calendar calendar = Calendar.getInstance();
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println("ERA: " + calendar.get(Calendar.ERA));
	System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	calendar.get(Calendar.HOUR_OF_DAY);
	
	  System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
	
	  System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
	
	  System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
}
}
