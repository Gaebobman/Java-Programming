import java.util.Scanner;

class book{
	String title, author;
	public book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void print() {
		System.out.println(title + " " + author);
	}
}
public class BookArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title, author;
		
		book[] books = new book[2];
		
		for(int i = 0  ; i <books.length ; i++) {
			System.out.println("제목>>>");
			title = scanner.nextLine();
			System.out.println("저자>>>");
			author = scanner.nextLine();
			
			books[i] = new book(title, author);
		}
		
		for(int i = 0  ; i <books.length ; i++) {
			books[i].print();
			
		}
		
		scanner.close();
	}

}
