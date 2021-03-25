package java2021.Week_3rd;

import java.util.Scanner;

public class Why {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);		
//
//		System.out.print("정수를 입력하세요: ");
//		int time = scanner.nextInt(); 		// 정수 입력
//		int second = time % 60; 				// 60으로 나눈 나머지는 초
//		int minute = (time / 60) % 60; 	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
//		int hour = (time / 60) / 60; 		// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
//		
//		System.out.print(time + "초는 "); // 줄바꿈 없이 출력
//		System.out.print(hour + "시간, ");
//		System.out.print(minute + "분, ");
//		System.out.println(second + "초입니다.");
//
//		scanner.close();

//		int a= 2; int b = 2;
//		b/= a * 2 % ++a;
//		System.out.println(a +"   " + b);
	
		short a = (short)0x55ff; //0101 0101 1111 1111
		short b = (short)0x00ff; //0000 0000 1111 1111

		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT

		byte c = 20; // 0x14 0001 0100
		byte d = -8; // 0xf8 1111 1000

		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c <<2); // c를 2비트 왼쪽 시프트
		System.out.println(c >>2); // c를 2비트 오른쪽 시프트. 0 삽입
		System.out.println(d >>2); // d를 2비트 오른쪽 시프트. 1 삽입
		System.out.printf("%x\n", (d >>>2)); // d를 2비트 오른쪽 시프트. 0 삽입

	
	}

}
