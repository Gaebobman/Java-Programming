package midterm;

public class Enum {
	enum Direction { EAST ,SOUTH, WEST, NORTH}
	public static void main(String[] args) {
		Direction[] dArr = Direction.values();
		for(Direction D: dArr) {
			System.out.printf("%s = %d\n", D.name(), D.ordinal());

		}
 
	}
}
