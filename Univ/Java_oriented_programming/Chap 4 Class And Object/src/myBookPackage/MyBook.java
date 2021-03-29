package myBookPackage;

public class MyBook {
	String title;
	String author;
	
	MyBook(String title, String author){
		this.title = title;
		this.author = author;
	}
	MyBook(String title){
		
		this(title,"작자미상");
	}
	 
	public static void main(String[] args) {
		MyBook prince = new MyBook("어린왕자", "생택쥐페리");
		MyBook chunHyang = new MyBook("춘향전");
		
		System.out.println("author: " + prince.author + " title: " + prince.title);
		System.out.println("author: " + chunHyang.author + " title: " + chunHyang.title);
	}

}
