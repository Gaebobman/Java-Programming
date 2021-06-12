package collectionEx;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
	       list.ensureCapacity(4);
			list.add( "MILK" );
			list.add( "BREAD" );
			list.add( "BUTTER" );
			list.add( 1, "APPLE" ); //1¹ø ÀÎµ¦½º¿¡ ³¢¿ö³Ö±â
			list.set( 2, "GRAPE" );  
		
			list.remove( 3 ); 
			
			for (int i = 0; i <list.size();i++) {
				System.out.println(list.get(i));
			}
	       System.out.println(list.indexOf("APPLE"));
	       System.out.println("##########");
	       LinkedList<String> list1 = new LinkedList<String>();
			list1.add( "MILK" );
			list1.add( "BREAD" );
			list1.add( "BUTTER" );
			list1.add( 1, "APPLE" );
			list1.set( 2, "GRAPE" );  
			
			list1.remove(3);
			for(int i = 0 ; i < list1.size(); i++) {
				System.out.println(list1.get(i));
			}
			System.out.println(list1.getFirst());
			System.out.println(list1.getLast());
	}

}
