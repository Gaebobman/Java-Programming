package cardGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck { 	 
	private ArrayList <Card> deck = new ArrayList<Card>(); 
	String [] suit = {"¢¼", "¢Â", "¢¾", "¢À"};
	String [] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	   
	public Deck() { 
	    for(int i = 0; i<suit.length;i++) 
	    	for(int j = 0; j<number.length;j++) 
	    	     deck.add(new Card(suit[i], number[j])); 	    
	} 
	  public void shuffle() {
		  Collections.shuffle(deck);
	  }
	  
	  public Card deal() {
		  return deck.remove(0);
	  }
}

