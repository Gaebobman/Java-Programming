package cardGame;

import java.util.Comparator;

public class Ascending implements Comparator<Card>{
	@Override
	public int compare(Card o1, Card o2) {
	        return o1.getNumber().compareTo(o2.getNumber());
    }
}
