package classpart.this_example;

class Person{
	String name;
	int age;
	
	Person(){
	this("�̸�����",1); //this�� Person(String, int)ȣ��;
					  // ##����## this("�̸�����",1); �� ���� ���� ���;��Ѵ�
					  //�����ڴ� Ŭ������ ������ �� ȣ��ǹǷ� 
				      //������ �Ϸ�� �Ŀ� �ٸ� ������ �����ϵ��� ����
	}
	
	Person(String name, int age)
	{	
		this.name = name;
		this.age = age;
	}
	
	Person returnItself() {
		return this;
	}				//�ּҰ� ��ȯ
	
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName= new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName.returnItself());
	}

}
