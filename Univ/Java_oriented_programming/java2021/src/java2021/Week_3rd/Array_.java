package java2021.Week_3rd;

public class Array_ {

	public static void main(String[] args) {
		int myarray[][] ;
		myarray = new int [4][];
     	myarray[0] = new int[3];
		myarray[1] = new int[2];
		myarray[2] =new int[3];
		myarray[3] = new int[2];
		
		for(int i = 0 ; i<myarray.length;i++) {
			for(int j = 0 ; j< myarray[i].length;j++)
				myarray[i][j] = (i+1)*10 +j;
		}

		for(int j =0 ; j < myarray.length;j++) {
			for(int k = 0 ; k<myarray[j].length;k++) {
				System.out.print(myarray[j][k] +" ");
			}
			System.out.print("\n");
		}
		System.out.println();

	}

}
