package crnChecker;

public class CRNChecker {
	final int [] WEIGHT = {1, 3, 7, 1, 3, 7, 1, 3, 5};
	boolean validateCRN(String crn) {
		if(!verifyLength(crn))
			return false;
		crn = crn.replace("-", "");
		int checkSum = 0;
		int x = 0;
		for(int i = 0; i < WEIGHT.length; i++) {
			x = crn.charAt(i) - 48;
			checkSum += x * WEIGHT[i];
		}
		
		checkSum += (crn.charAt(8)-48) * 5 /10;	//CheckSum += I*5/10 �߰�
		int checkNum  = 10 - checkSum % 10 ;
		int validateNum = crn.charAt(9)-48;
		if(validateNum == checkNum) {
			System.out.println("��ȿ�� ����� ��Ϲ�ȣ�Դϴ�.");
			return true;
		}
		else {
			System.out.println("������ȣ ����: ��ȿ���� ���� ����� ��Ϲ�ȣ�Դϴ�.");
			return false;
		}
	}
	boolean verifyNumeric(String crn){
		crn= crn.replace("-", "");
		char c = ' ';
		
		for(int i =0 ; i < crn.length(); i++) {
			c = crn.charAt(i);
			if(c < '0' || c > '9') {
				System.out.println("���ڿ���: ����� ��Ϲ�ȣ���� Dash(-)�� ���ڸ� �����մϴ�.");
				return false;				
			}
		}
		
		return true;
	}
	boolean verifyLength(String crn) {
		int length = crn.length();
		if(length == 12) {
			return true;
		}	//����ڵ�Ϲ�ȣ 10�ڸ� + Dash(-)2�� => 12�ڸ�
		else {
			return false;
		}
	}
	String[] getSubCRN(String crn) {
		if(crn.contains("-") != true)
		{
			return null;
		}
		else {
			String [] subCRN = crn.split("-");
			for(int i = 0; i < subCRN.length; i++) {
				System.out.println("�и�:" + subCRN[i]);
			}
			return subCRN;
		}
	}

	
}
