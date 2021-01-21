package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�ڷᱸ��", "������"));
		library.add(new Book("��ȸ��", "�ּ���"));
		library.add(new Book("����","�ڰ渮"));
		library.add(new Book("������", "�ּ���"));
		library.add(new Book("��ó�� ¢�� ��", "������"));
		
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
