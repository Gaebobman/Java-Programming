package stringTestRRN;

class RRNChecker{
	boolean verifyLength(String rrn) {
		int length = rrn.length();
		if(length == 14) {
			System.out.println("길이 확인");
			return true;
		}else {
			System.out.println("길이 오류");
			return false;
		}
	}
	
	boolean verifyNumeric(String rrn) {
		rrn = rrn.replace("-", "");
		int i =0;
		for(i = 0; i < rrn.length();i++) {
			
			char c = rrn.charAt(i);
			if(c < '0' || c > '9') {
				System.out.println("숫자 오류");
				return false;
			}
		}
		System.out.println("숫자 확인");
		return true;
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
	String printGender(String subRRN) {
		char gender = subRRN.charAt(0);
		switch(gender) {
			case '1':
			case '3':
			case '5':
			case '9':
				System.out.println("남성입니다.");
				return "M";
		}
		System.out.println("여성입니다.");
		return "F";
	}
	
	final int [] w = {2,3,4,5,6,7,8,9,2,3,4,5};
	boolean validateRRN(String rrn) {
		rrn= rrn.replace("-", "");
		
		int checkSum = 0;
		for(int i = 0; i< w.length;i++) {
			int x = rrn.charAt(i) - 48;
			checkSum += x* w[i];
		}
		int checkNum = (11 -(checkSum % 11)) % 11;
		int validateNum = rrn.charAt(12) - 48;
		
		if(checkNum == validateNum)
		{
			System.out.println("유효함");
			return true;
			
		}
		
		else {
			System.out.println("유효하지 않음");			
			return false;
		}
	}
}


public class StringTest {
	static String rrn = " 990101-1234563 ";
	public static void main(String[] args) {
		RRNChecker checker = new RRNChecker();
		rrn = rrn.trim();
		checker.verifyLength(rrn);
		checker.verifyNumeric(rrn);
		String[] subString  = checker.getSubRRN(rrn);
		checker.printGender(rrn.substring(7));
		checker.validateRRN(rrn);

	}

}
