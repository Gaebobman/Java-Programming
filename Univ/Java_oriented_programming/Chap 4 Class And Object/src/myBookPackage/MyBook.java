package myBookPackage;

public class MyBook {
	String title;
	String author;
	
	MyBook(String title, String author){
		this.title = title;
		this.author = author;
	}
	MyBook(String title){
		
		this(title,"���ڹ̻�");
	}
	 
	public static void main(String[] args) {
		MyBook prince = new MyBook("�����", "�������丮");
		MyBook chunHyang = new MyBook("������");
		
		System.out.println("author: " + prince.author + " title: " + prince.title);
		System.out.println("author: " + chunHyang.author + " title: " + chunHyang.title);
	}

}
