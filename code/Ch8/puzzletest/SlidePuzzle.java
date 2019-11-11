package puzzletest;

public class SlidePuzzle {
	public static void main(String[] args)
	  { int size = 6;  // a  4 x 4  slide puzzle
	    SlidePuzzleBoard board = new SlidePuzzleBoard(size);
	    PuzzleWriter writer = new PuzzleWriter(board, size);
	    PuzzleController controller = new PuzzleController(board, writer);
	    controller.play();
	  }
}
