
/** LotteryCalculator calculates lottery odds */
public class LotteryCalculator
{ /** calcProbability  computes the odds of choosing
    * correctly  n  picks  from a range of  m  possibles
    * @param possibles - the range of m possibles
    * @param picks - the user's n picks
    * @return the odds
    * @throw RuntimeException if inputs are invalid */
  public float calcProbability(int possibles, int picks)
  { if ( possibles < 0 )
         { throw new RuntimeException("invalid possibles"); }
    else { if ( picks < 0  ||  picks > possibles )
                { throw new RuntimeException ("invalid picks"); }
           else { return (((float) Numerical.factorial(picks))
                          / Numerical.product((possibles-picks)+1,possibles) );
                }
         }
  }
}


