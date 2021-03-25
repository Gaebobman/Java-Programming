package java2021.Week_3rd;

import java.util.Scanner;

public class Prime_Legendre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;			// 사용자로부터 입력받을 변수 N
		int counter = 0; 	// 소수의 갯수를 세는 변수
		System.out.println("학번: 12171735 이름: 이준표");		
		
		do {
			System.out.print("탐색 범위 선택(0입력시 종료):");
			N = scanner.nextInt();
			if(N == 0) 
				break; //사용자가 0입력시 아래의 코드는 실행되지 않습니다.
			{
				for(double i = 2 ; i <=N;i++) {
					if(primality_test(i) == true)
						counter++;
				}
			}
			System.out.println("Nums of primes:" + counter + " Legendre:"+legendre_test(N));
			counter = 0;	//소수의 갯수를 세는 counter 0 으로 초기화
		}while(N != 0); //사용자가 0입력시 while문이 종료됩니다.

		

	}
	
 	static boolean primality_test(double n)	{
		double sqrt = Math.floor(Math.sqrt(n));
		for(double i = 2 ; i <= sqrt ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int legendre_test(int n) {
		
		return (int) Math.round((n/(Math.log(n) -1))) ;
	}

}
