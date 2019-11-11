package puzzletest;

public class SlidePuzzleBoard {
	private int size;   //  the board's size
	private PuzzlePiece[][] board; // the array that holds the pieces
	private int empty_row;  
	private int empty_col;
	// representation invariant:  board[empty_row][empty_col] == null

	public SlidePuzzleBoard(int s) {
		size = s; 
		board = new PuzzlePiece[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++ ) {
				board[i][j] = new PuzzlePiece(i * size + j); 
			}
		}
		empty_row = 0; 
		empty_col = 0;
		board[empty_row][empty_col] = null;
	}
	
	public PuzzlePiece[][] contents() {
		return board;
	}
	
	public boolean move(int w) {
		int row = 0; // w를 값으로 갖는 피스의 행  
		int col = 0; // w를 값으로 갖는 피스의 열
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++ ) {
				if (board[i][j] != null && board[i][j].valueOf() == w) {
					row = i; 
					col = j;
				}
			}
		}
		if (Math.abs(empty_row - row) + Math.abs(empty_col - col) == 1) {
			board[empty_row][empty_col] = board[row][col];
			board[row][col] = null; 
			empty_row = row;
			empty_col = col;
			return true; 
		}
		else {
			return false; 
		}
	}
	
}
