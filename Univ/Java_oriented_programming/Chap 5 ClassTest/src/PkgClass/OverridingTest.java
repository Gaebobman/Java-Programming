package PkgClass;

class Point{
	int x, y; 
	Point(int x, int y) {
		//������ ù�ٿ� super(); ���;��Ѵ� 
		//������ �ڵ�����
		this.x = x; 
        this.y = y;
	}
	//��Ӱ��迡���� ����Ʈ ����Ʈ���� �ǹ������� ������
	Point(){
		this.x = 0;
		this.y = 0;
	}
	

}
class ColorPoint extends Point{
	String color;
	ColorPoint(int x, int y ,String color){
		//������ ù�ٿ��� Super();�߰���
		super(x,y);
        this.color = color;
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		Point c1 = new ColorPoint(1,2,"red");
	
	}

}
