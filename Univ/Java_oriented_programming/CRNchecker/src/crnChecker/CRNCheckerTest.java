package crnChecker;

import java.util.Scanner;

public class CRNCheckerTest {
//	static String crn = "220-81-62517";//네이버 사업자등록번호
//	static String badcrn1 = "220-81-62516";//검증번호가 맞지 않는 사업자 등록번호
//	static String badcrn2 = "220-81-6251";//길이가 맞지 않는 사업자 등록번호
//	static String badcrn3 = "220-C1-6f5a7";//숫자가 아닌 사업자 등록번호
	
	public static void main(String[] args) {
		System.out.println("12171735 이준표");
		CRNChecker checker = new CRNChecker();
		String command = "y";
		String crn = "";
		Scanner scanner = new Scanner(System.in);
		while(command.equals("y")) {
			System.out.print("사업자 등록번호를 입력해주세요. \n형식: 1234-56-7890\n>>");
			crn = scanner.nextLine();
			crn = crn.trim();	//사용자가 앞뒤로 공백문자를 넣을시 오류 방지
			if(checker.verifyLength(crn))
				System.out.println("유효한 길이입니다.");
			else
				System.out.println("길이오류: 사업자 등록번호는 Dash(-)포함 12자입니다.");
			checker.verifyNumeric(crn);
			checker.validateCRN(crn);
			
			System.out.print("\n계속하시겠습니까? y/n \n>>");
			command = scanner.nextLine();
			System.out.print("\n");
			
		
		}
	
		

		
		
		scanner.close();
	}
	

}
