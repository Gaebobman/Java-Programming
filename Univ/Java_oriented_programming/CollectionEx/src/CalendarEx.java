import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);	//Zero base 이므로 3 = > 4월
		int date = now.get(Calendar.DATE);
		
		int date1 = now.get(Calendar.DAY_OF_MONTH);
		int date2 = now.get(Calendar.DAY_OF_YEAR);
		int date3 = now.get(Calendar.DAY_OF_WEEK);
		
		int last = now.getActualMaximum(Calendar.DATE);
		
		System.out.printf("%d %d %d (%d, %d, %d) %d",year, month+1, date, date1, date2, date3, last);
		

	}

}
