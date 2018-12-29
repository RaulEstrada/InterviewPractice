import java.util.ArrayList;
import java.util.List;

public class KeyboardPath {
	class Coords {
		int row;
		int column;
		
		public Coords(int row, int column) {
			this.row = row;
			this.column = column;
		}
	}
	
	enum Moves {
		UP, DOWN, RIGHT, LEFT;
	}
	
	private static final int KEYBOARD_WIDTH = 7;
	
	public List<Moves> findKeyPathToWord(int x, int y, String word) {
		Coords current = new Coords(y,x);
		List<Moves> moves = new ArrayList<Moves>();
		for (char letter : word.toCharArray()) {
			Coords target = findCoords(letter);
			if (current.row < target.row) {
				addMoves(target.row - current.row, Moves.DOWN, moves);
			} else if (current.row > target.row) {
				addMoves(current.row - target.row, Moves.UP, moves);
			}
			if (current.column < target.column) {
				addMoves(target.column - current.column, Moves.RIGHT, moves);
			} else if (current.column > target.column) {
				addMoves(current.column - target.column, Moves.LEFT, moves);
			}
			current = target;
		}
		return moves;
	}
	
	private void addMoves(int amount, Moves move, List<Moves> moves) {
		for (int i = 0; i < amount; i++) {
			moves.add(move);
		}
	}
	
	private Coords findCoords(char letter) {
		int row = (Character.toLowerCase(letter) - 'a') / KEYBOARD_WIDTH;
		int column = (Character.toLowerCase(letter) - 'a') % KEYBOARD_WIDTH;
		return new Coords(row, column);
	}
	
	public static void main(String[] args) {
		KeyboardPath p = new KeyboardPath();
		List<Moves> res = p.findKeyPathToWord(0, 0, "HelloRaul");
		for(Moves move : res) {
			System.out.println("" + move);
		}
	}
}
