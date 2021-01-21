package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("자료구조", "심정섭"));
		library.add(new Book("논리회로", "최성용"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("정수론", "최수진"));
		library.add(new Book("개처럼 짖는 법", "개새끼"));
		
		for(int i = 0 ; i < library.size();i++) {
			Book book  =library.get(i);
			book.showBookInfo();
		}
		System.out.println();
	
	
	
		System.out.println("=====Enhanced For Loop=====");
		
		for(Book book : library) {
			book.showBookInfo();
		}
	
	
	}
	
	
}
