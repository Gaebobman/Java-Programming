package array;

public class ObjectCopy2 {
	
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "외국인");
		bookArray1[2] = new Book("자료구조", "심정섭");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

		for(int i = 0 ; i< bookArray2.length ; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		System.out.println("=====BookArray1=====");
		for(int i = 0 ; i< bookArray1.length ; i++) {
			bookArray1[i].showBookInfo();
		}
		bookArray1[0].setAuthor("개새끼");
		bookArray1[0].setBookname("개처럼 짖는 법");
		//arraycopy는 인스턴스의 주소값만 복사한다는 사실
		//따라서 arraycopy는 shallow Copy 얕은 복사다!
		
		System.out.println("=====BookArray2=====");
		for(int i = 0 ; i< bookArray2.length ; i++) {
			bookArray2[i].showBookInfo();
		} 
		
	
	}
	
	
}
