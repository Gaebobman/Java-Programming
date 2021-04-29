import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		v.add(1);
		v.add(4);
		v.add(3);
		//v.add(a); //컴파일 에러; 제네릭의 장점.
		v.remove(1);
		for(int i = 0 ; i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}

}
