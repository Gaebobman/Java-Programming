
public class ExException2 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		int i = 0 ; // for 문 밖에 놔야지 debugging time에 Catch문에서 접근가능하다.
		intArray[0]=0;
		try {
			for(i = 1 ;i < intArray.length;i++) {
				
				intArray[i] = intArray[i-1] + i +1;
				System.out.println("intArray[" + i +"]= "+ intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
