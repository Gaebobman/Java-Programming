package stringTestRRN;

import java.util.Calendar;

class RRNChecker1{
	Calendar printDateOfBirth(String subRRN, char c) {
		Calendar dob = Calendar.getInstance();
		dob.clear();
		
		String year= subRRN.substring(0,2);
		String month= subRRN.substring(2,4);
		String day= subRRN.substring(4,6);
		int code = c -48;
		switch(code) {
		case 1: case 2: case 5:case 6: 
			year = "19" + year;
			break;
		case 3: case 4: case 7:case 8: 
			year = "20" + year;
			break;
		case 9: case 10:
			year = "18" + year;
			break;
		}
		int yy =Integer.parseInt(year);
		int mm =Integer.parseInt(month)-1; // Zero base 주의
		int dd =Integer.parseInt(day);
		dob.set(yy,mm,dd);
		
		return dob;
	}
	
	String[] getSubRRN(String rrn) {
		if(rrn.contains("-") != true)
		{
			return null;
		}
		else {
			String [] subRRN = rrn.split("-");
			for(int i = 0; i < subRRN.length; i++) {
				System.out.println("분리:" + subRRN[i]);
			}
			return subRRN;
		}
	}
}

public class CalendarWithRRN {

	static String rrn = "990101-1234563";
	public static void main(String[] args) {
		RRNChecker1 checker = new RRNChecker1();
		rrn= rrn.trim();
		
		String[] subs = checker.getSubRRN(rrn);
		Calendar cal = checker.printDateOfBirth(subs[0], subs[1].charAt(0));
		Calendar now =  Calendar.getInstance();
		long diff = (now.getTimeInMillis() - cal.getTimeInMillis())/1000;
		long diffDay = diff/(60*60*24);
		System.out.println("태어난지 " + diffDay +"일 째 입니다.");

	}

}
