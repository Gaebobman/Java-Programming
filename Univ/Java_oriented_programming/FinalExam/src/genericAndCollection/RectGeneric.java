package genericAndCollection;

class Rect <T>{

	private T width;
	private T height;
	
	public void setWidth(T width) {
		this.width = width;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	
	public Rect(T width, T height){
		this.width = width;
		this.height = height;
	}

	public T getWidth() {
		return width;
	}
	public T getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		
		return "Rect [width=" + width + ", height=" + height + "]";
	}
}

class Item2 <K, V>{
	private K key;
	private V value;
	public Item2(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Item [key=" + key + ", value=" + value + "]";
	}
}

class MyArray{
	static <T> void swap(T[] arr, int x, int y) {
		T tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	static <T> void print(T [] arr) {
		for(T i : arr) {
			System.out.print(i.toString() + " ");
		}
	}
}

class MyMath{
	static <T extends Number> double getMax(T [] ary) {
		T max = ary[0];
		
		for(T i: ary ) {
			if(max.doubleValue() < i.doubleValue())
				max = i;
		}
		return max.doubleValue();
	}
}

public class RectGeneric {

	public static void main(String[] args) {
		Rect <Integer> r1 = new Rect<Integer>(1,2);
		System.out.println(r1);
		Rect <Double> r2 = new Rect<>(1.1, 1.2);
		System.out.println(r2);
		
		Item2 <String, Integer> a1 = new Item2<String, Integer>("id", 2);
		System.out.println(a1);
		Item2 <Integer, Integer> a2 = new Item2<Integer, Integer>(1, 2);
		System.out.println(a2);  

		Integer[]ary = {1,2,3,4,5};
		Double [] ary1 = {1.1, 2.2, 3.3, 4.4, 5.5};
		String [] ary2= {"1", "2", "3", "4", "5"};
		MyArray.swap(ary, 3, 4);	// 타입추론 생략
		MyArray.print(ary);
		System.out.println();
		MyArray.print(ary1);
		System.out.println();
		MyArray.print(ary2);
		System.out.println();
		
		System.out.println(MyMath.getMax(ary));
		
	
	}

}
