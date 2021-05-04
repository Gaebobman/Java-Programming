package cardGame;

public class PokerGame {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();	
		
		Player p1 = new Player();
		Player p2 = new Player();

		for(int i =0 ; i <5; i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
	
		p1.showCard();
		p2.showCard();
	}

}
