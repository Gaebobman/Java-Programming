package midterm;

class A {
    public A() {
        this(0);
        System.out.println("A");
    }
	
    public A(int x) {    	
        System.out.println("A" + x); 
    }
}


class B extends A {
    public B() {
        super(100);
        System.out.println("B" + 100);
    }
	
     public B(int x) {
         this();
         System.out.println("B" + x);
    }
}

public class ConstructorTesx {

	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5};
		int sum=0;
		for(int e : ary) {
			sum += e;
		}
		System.out.println(sum);
		
		   
	}

}




