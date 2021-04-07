package PkgClass;

class Point{
	int x, y; 
	Point(int x, int y) {
		//생성자 첫줄에 super(); 나와야한다 
		//없으면 자동생성
		this.x = x; 
        this.y = y;
	}
	//상속관계에서는 디폴트 컨스트럭터 의무적으로 만들자
	Point(){
		this.x = 0;
		this.y = 0;
	}
	

}
class ColorPoint extends Point{
	String color;
	ColorPoint(int x, int y ,String color){
		//생성자 첫줄에는 Super();추가됨
		super(x,y);
        this.color = color;
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		Point c1 = new ColorPoint(1,2,"red");
	
	}

}
