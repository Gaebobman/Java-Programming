package classpart.this_example;

class Person{
	String name;
	int age;
	
	Person(){
	this("이름없음",1); //this로 Person(String, int)호출;
					  // ##주의## this("이름없음",1); 이 제일 먼저 나와야한다
					  //생성자는 클래스가 생성될 때 호출되므로 
				      //생성이 완료된 후에 다른 동작을 수행하도록 하자
	}
	
	Person(String name, int age)
	{	
		this.name = name;
		this.age = age;
	}
	
	Person returnItself() {
		return this;
	}				//주소값 반환
	
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName= new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName.returnItself());
	}

}
