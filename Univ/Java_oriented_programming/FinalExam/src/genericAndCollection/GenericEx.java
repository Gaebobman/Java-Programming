package genericAndCollection;

class Item <E>{
	private E data;
	
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
}

public class GenericEx {

	public static void main(String[] args) {
		Item<Integer> item = new Item<>();
		item.setData(1);
		//item.setData("1");
		Integer i = item.getData();
		System.out.println(i);
	}

}
