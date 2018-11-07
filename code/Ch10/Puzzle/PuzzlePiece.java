/** PuzzlePiece  defines of a puzzle playing piece */
public class PuzzlePiece  
{ private int face_value;  // the value written on the piece's face

  /** Constructor PuzzlePiece creates a piece
    * @param value - the value that appears on the face of the piece */
  public PuzzlePiece(int value)
  { face_value = value; }

  /** valueOf returns the face value of the piece */
  public int valueOf()
  { return face_value; }
}