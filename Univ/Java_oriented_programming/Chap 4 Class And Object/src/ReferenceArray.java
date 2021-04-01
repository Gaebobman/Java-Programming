class Circle{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}
	
	
}
public class ReferenceArray {

	public static void main(String[] args) {
		
		Circle[] myArray = new Circle[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			myArray[i] = new Circle(i);
			System.out.println(myArray[i].getArea());
		}

	}

}
