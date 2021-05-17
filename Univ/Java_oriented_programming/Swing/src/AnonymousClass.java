
interface IComponent {
	public void method();
}
class Register {
	IComponent first;
	IComponent second;
	void addFirst(IComponent obj) {
		first = obj;
	}
	void addSecond(IComponent obj) {
		second = obj;
	}
}

public class AnonymousClass {
	static Register register = new Register();
	public static void main(String[] args) {
		register.addFirst(new IComponent() {
			public void method() {
				System.out.println("A!");
			}
		});
		
		register.addSecond(new IComponent() {
			public void method() {
				System.out.println("B!");	
			}
		});
	}
}
