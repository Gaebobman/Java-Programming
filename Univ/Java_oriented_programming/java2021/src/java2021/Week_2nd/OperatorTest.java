package java2021.Week_2nd;

public class OperatorTest {

	public static void main(String[] args) {
		boolean result = false;
		int age = 25;
		int score = 699;
		
  		result =  age -1 >=26 || ++score >= 700;
		
		System.out.println(result +"," +age +"," + score);
		
		System.out.println(1 + 5 % 3 < 4 || false);
		
	
	}

}

