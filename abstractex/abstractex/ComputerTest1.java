package abstractex;

public class ComputerTest1 {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); 추상 클래스는 인스턴스로 생성할 수 없다.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook(); 추상 클래스는 인스턴스로 생성할 수 없다.
		Computer c4 = new MyNoteBook();
	
	}

}
