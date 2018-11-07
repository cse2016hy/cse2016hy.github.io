/** Treasury describes the method an object has for yielding a treasure */
public interface Treasury
{ /** yieldTreasure surrenders the room's treasure
    * @param p - the player who requests the treasure
	* @return the treasure (or null, if the treasure is already taken) */
  public TreasureProperty yieldTreasure(PlayerBehavior p);
}