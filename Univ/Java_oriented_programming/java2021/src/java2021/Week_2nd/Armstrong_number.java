package java2021.Week_2nd;

import java.util.ArrayList;

public class Armstrong_number {
	

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>(); //암스트롱 수를 저장할 어레이 리스트
		
		for(int i = 1 ;i <=999 ; i++) {
			if( isArm(i) != -1) { mylist.add(i); }
			
		}
	
		System.out.println("학번: 12171735 이름: 이준표");
		
		System.out.printf("암스트롱수: ");		//한 줄 출력을 위해 printf 사용
		
		for(int i = 0 ; i < mylist.size();i++) {
			System.out.printf("%d" , mylist.get(i) );
			
			if(i < mylist.size() -1 ) { //쉼표가 마지막에 나오는 것을 방지
				System.out.printf(", ");
			}	
		}
	}
	
	public static int isArm(int num) {
		int numbernow =	num;
		int checkArm =0;	// 현재 검사하고 있는 수가 암스트롱수인지 확인할때 사용하는 변수
			
			for(int j = 2 ; j >= 0 ; j--) {
			checkArm += (int)Math.pow( (numbernow /(int)Math.pow(10,j) ),3); 	// 자릿수마다 3제곱 해서 변수에 더함
			numbernow %= (int)Math.pow(10,j);
			}
			
			if(checkArm == num) {	//현재 검사하고 있는 수가 암스트롱 수 인지 확인하여 맞으면 num을 return
				return num;
			}
			
			else	
				return -1;
	}
}