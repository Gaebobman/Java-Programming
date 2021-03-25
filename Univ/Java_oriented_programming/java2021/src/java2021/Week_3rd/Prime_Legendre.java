package java2021.Week_3rd;

import java.util.Scanner;

public class Prime_Legendre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;			// ����ڷκ��� �Է¹��� ���� N
		int counter = 0; 	// �Ҽ��� ������ ���� ����
		System.out.println("�й�: 12171735 �̸�: ����ǥ");		
		
		do {
			System.out.print("Ž�� ���� ����(0�Է½� ����):");
			N = scanner.nextInt();
			if(N == 0) 
				break; //����ڰ� 0�Է½� �Ʒ��� �ڵ�� ������� �ʽ��ϴ�.
			{
				for(double i = 2 ; i <=N;i++) {
					if(primality_test(i) == true)
						counter++;
				}
			}
			System.out.println("Nums of primes:" + counter + " Legendre:"+legendre_test(N));
			counter = 0;	//�Ҽ��� ������ ���� counter 0 ���� �ʱ�ȭ
		}while(N != 0); //����ڰ� 0�Է½� while���� ����˴ϴ�.

		

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
