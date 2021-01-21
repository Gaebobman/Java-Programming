package array;

public class Book {
	private String bookname;
	private String author;
	
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book() {}
	
	public Book(String bookName , String author) {
		this.bookname = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookname + "," +author);
	}
	
	
}

