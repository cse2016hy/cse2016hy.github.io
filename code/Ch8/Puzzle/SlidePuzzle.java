/** SlidePuzzle  implements a  4 x 4  slide puzzle.  Input to the program
  * is a sequence of integers between 1..15.  The program never terminates. */
public class SlidePuzzle
{ public static void main(String[] args)
  { int size = 6;  // a  4 x 4  slide puzzle
    SlidePuzzleBoard board = new SlidePuzzleBoard(size);
    PuzzleWriter writer = new PuzzleWriter(board, size);
    PuzzleController controller = new PuzzleController(board, writer);
    controller.play();
  }
}
