package java2021.Week_2nd;

import java.util.ArrayList;

public class Armstrong_number {
	

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>(); //�Ͻ�Ʈ�� ���� ������ ��� ����Ʈ
		
		for(int i = 1 ;i <=999 ; i++) {
			if( isArm(i) != -1) { mylist.add(i); }
			
		}
	
		System.out.println("�й�: 12171735 �̸�: ����ǥ");
		
		System.out.printf("�Ͻ�Ʈ�ռ�: ");		//�� �� ����� ���� printf ���
		
		for(int i = 0 ; i < mylist.size();i++) {
			System.out.printf("%d" , mylist.get(i) );
			
			if(i < mylist.size() -1 ) { //��ǥ�� �������� ������ ���� ����
				System.out.printf(", ");
			}	
		}
	}
	
	public static int isArm(int num) {
		int numbernow =	num;
		int checkArm =0;	// ���� �˻��ϰ� �ִ� ���� �Ͻ�Ʈ�ռ����� Ȯ���Ҷ� ����ϴ� ����
			
			for(int j = 2 ; j >= 0 ; j--) {
			checkArm += (int)Math.pow( (numbernow /(int)Math.pow(10,j) ),3); 	// �ڸ������� 3���� �ؼ� ������ ����
			numbernow %= (int)Math.pow(10,j);
			}
			
			if(checkArm == num) {	//���� �˻��ϰ� �ִ� ���� �Ͻ�Ʈ�� �� ���� Ȯ���Ͽ� ������ num�� return
				return num;
			}
			
			else	
				return -1;
	}
}