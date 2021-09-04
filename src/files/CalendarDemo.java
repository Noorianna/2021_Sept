package files;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
		public static void main(String[] args) {
			
			GregorianCalendar cal = new GregorianCalendar();
			System.out.println(cal);
//			System.out.println(cal.getTime());
//			System.out.println(cal.getCalendarType());
//			System.out.println(cal.get(Calendar.YEAR));
//			System.out.println(cal.get(Calendar.MONTH));
//			System.out.println(cal.isLeapYear(Calendar.YEAR));
			//cal.add(Calendar.YEAR, 1);
			//System.out.println(cal.getTime());
			//cal.add(Calendar.MONTH, -1);
		cal.add(Calendar.MONTH, +7);
		System.out.println(cal);
		//	System.out.println(cal.getTime());
		//	cal.add(Calendar.DAY_OF_WEEK, +7);
			System.out.println(cal.getTime());
	//		Date fdate = cal.getTime();
	//		System.out.println(fdate);
			
		}

	}
