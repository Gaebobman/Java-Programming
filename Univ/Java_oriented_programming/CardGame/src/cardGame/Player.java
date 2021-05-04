package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player{
	List<Card> list = new ArrayList<Card>();
	public void getCard(Card card) {
		list.add(card);
	}
	public void showCard() {
						System.out.println(list);
	}	
}
