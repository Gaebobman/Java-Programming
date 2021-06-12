package collectionEx;

import java.util.*;

public class CollectionsEx2 {
	static void printList(LinkedList<String> I) {
		Iterator<String> it = I.iterator();
		while(it.hasNext()) {
			String s = it.next();
			String separator;
			if(it.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(s + separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		
		Collections.sort(myList);
		printList(myList);

		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1 ;	
		System.out.println("�ƹ�Ÿ�� " + index +"��° ����Դϴ�.");
	}

}
