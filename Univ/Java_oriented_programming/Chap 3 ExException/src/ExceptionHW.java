import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHW {

	public static void main(String[] args) {
		int inputNumber = 0; //  사용자로부터 입력받을 정수.
		String doAgain = "y"; // 다시 하시겠습니까 / yes or no
		int numOfAttempts = 0; // 몇번의 시도만에 정답을 맞췄는지 세는 변수
		int randNum = (int)(Math.random()*100) +1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("학번: 12171735 이름: 이준표 \nGuess what(1~100)!");
			while(doAgain.equals("y")) {
				try {
				System.out.print("Input>");
				inputNumber = scanner.nextInt();
				numOfAttempts++; // 사용자가 정수를 입력 했을때만 시도 횟수를 증가시킵니다.
				
				if(inputNumber == randNum) {
					System.out.println("정답!! "+ numOfAttempts+"번만에 맞춤!");
					System.out.println("다시하시겠습니까(y/n)>");
					//정답인지 확인후 사용자에게 다시 실행할지 묻습니다.
					
						doAgain = scanner.next();//y입력시 재실행 n 입력시 종료
						if(!doAgain.equals("y") && !doAgain.equals("n")) {
							while(!doAgain.equals("y") && !doAgain.equals("n")) {
								System.out.println("y와 n만 입력하세요!");
								//사용자가 y 또는 n이 아닌 char을 입력하였을때 출력
								doAgain = scanner.next();
							}
						}
					
					randNum = (int)(Math.random()*100) +1;
					numOfAttempts = 0;
				}else if(inputNumber > randNum){
					System.out.println("Down"); 
				}else {
					System.out.println("Up");
				}
			
			}catch(InputMismatchException e){
				//정수가 아닌 값을 입력하게 되면 catch하게 됩니다.
				System.out.println("정수만 입력하세요.");
				scanner.nextLine(); 
				//버퍼에 개행문자가 남아있을경우를 대비하여 scanner가 개행문자를 처리하게 합니다.
			}
			
		}
		scanner.close();
	}

}