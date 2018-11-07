/** Key models a Library-of-Congress-style id number,
  *  consisting of a letter code concatenated to a decimal number */
public class Key
{ private String letter_code;  // the letter code, e.g.,  "QA"
  private double number_code;  // the number code, e.g.,  76.884

  /** Constructor Key constructs a catalog number
    * @param letters - the letter code, e.g.,  "QA"
    * @param num - the decimal number code, e.g.,  76.884 */
  public Key(String letters, double num)
  { letter_code = letters;
    number_code = num;
  }

  /** equals returns whether the catalog number held within this object
    *  is identical to the catalog number held within  c
    * @param c - the other catalog number
    * @return true, if this catalog number equals  c; return false, otherwise */
  public boolean equals(Key c)
  { String s = c.getLetterCode();
    double d = c.getNumberCode();
    return ( s.equals(letter_code)  &&  d == number_code );
  }

  /** getLetterCode returns the letter code part of this catalog number
    * @return the letter code, e.g.,  "QA"  */
  public String getLetterCode() { return letter_code; }
  
  /** getNumberCode returns the number code part of this catalog number
    * @return the number code, e.g.,  "76.884"  */
  public double getNumberCode() { return number_code; }
}

