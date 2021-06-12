package genericAndCollection;

class Item3 <T>{

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Item3 [data=" + data + "]";
	}
}
class SubItem1<T> extends Item3<T>{}

public class WildCardEx {
	
	static void printItem(Item3<?> item) {
		String d = item.toString();
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Item3<Integer> item1 = new Item3<Integer>();
		item1.setData(1);
		Item3<Double> item2 = new Item3<Double>();
		item2.setData(2.2);
		
		//���ϵ� ī�� ���
		printItem(item1);
		printItem(item2);
		
		//���ϵ�ī�� ���׸�Ŭ���� ��ü�� ������ �ִ�.
		//Item3<?> x = new Item3<Integer>();
		//x = new Item3<Double>();
		
		
		// Item3<Number> item3 = new Item<Integer>();		//�Ұ���
	
		// Item<Integer> Item4 = new SubItem1<Integer>();	//����
	}

}
