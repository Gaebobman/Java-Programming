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
		System.out.println("Player1 : 12171735/이준표");
		p1.showCard();
		System.out.println("Player2 : 컴퓨터");
		p2.showCard();
		
		p1.compare(p2);
		
	}
}
