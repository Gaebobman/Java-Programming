import java.util.Scanner;

public class week4_1 {
   
   public static void game(Scanner game_scanner) {
	   
      int randNum = (int)(Math.random()*100)+1;
      System.out.println(randNum);
      int n=0;
      int i=0;
      System.out.println("Guess what(1~100)!");
      while(true) {
         i++;
         System.out.print("Input>");
         n = game_scanner.nextInt();
         if(randNum==n) {
            System.out.println("정답!! "+i+"번 만에 맞춤!");
            break;
         }
         else if(randNum>n) {
            System.out.println("UP");
         }
         else {
            System.out.println("Down");
         }
      }
      
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      char option= 'y';
      System.out.println("학번: 12171643 이름: 신지우");
      while(option=='y') {
         game(scanner);
         System.out.println("다시하겠습니까(y/n)");
         scanner.nextLine();
         option = scanner.next().charAt(0);
         if(option == 'n') {
            break;
         }
      }
      scanner.close();
   }

}