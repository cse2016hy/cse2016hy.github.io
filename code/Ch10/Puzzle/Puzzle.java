/** Puzzle creates and displays the slide puzzle */
public class Puzzle
{ public static void main(String[] args)
  { int size = 4;  // a  4 x 4  slide puzzle
    SlidePuzzleBoard board = new SlidePuzzleBoard(size); // see Fig. 10, Ch. 8
    PuzzleFrame frame = new PuzzleFrame(size, board);
  }
}