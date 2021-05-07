package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player{
	public static final String J = "11";
	public static final String Q = "12";
	public static final String K = "13";
	
	List<Card> list = new ArrayList<Card>();
	
	public void getCard(Card card) {
		list.add(card);
	}
	public void showCard() {
		Ascending ascending = new Ascending();	//Collection.sort À§ÇÑ Ascending Class 
		Collections.sort(list, ascending);
		System.out.print(" [Card");
		for(int i = 0 ; i < list.size();i++) {
			System.out.print("[suit ="+list.get(i).getSuit()+", number="+list.get(i).getNumber()+ "]");
			if(i != list.size() -1 )
				System.out.print(", ");
		}
		System.out.printf("]\n");
	}
	public void compare(Player p2) {
		String p1Card = this.list.get(4).getNumber();
		String p2Card = p2.list.get(4).getNumber();
		if(p1Card.compareTo(p2Card)> 0) {
			
			System.out.println("Player1 Win!");
			return;
			
		}else if(p1Card.compareTo(p2Card)< 0) {
			System.out.println("Player2 Win!");
			return;
		}else {
			String p1CardSuit  =this.list.get(4).getSuit();
			String p2CardSuit  = p2.list.get(4).getSuit();
			
			if(p1CardSuit.compareTo(p2CardSuit)>0) {
				System.out.println("Player1 Win!");
			}else if(p1CardSuit.compareTo(p2CardSuit)<0) {
				System.out.println("Player2 Win!");
			}			
			else {
				System.out.println("Draw!");
			}
		}
	}
}
