/** PlayerBehavior defines the behavior of a player of an adventure game */
public interface PlayerBehavior
{ /** speak lets the player say one word
	* @return the word */
  public String speak();

  /** explore atempts to enter a room and explore it
    * @param r - the room that will be explored
	* @return whether the room was successfully entered */
  public boolean explore(RoomBehavior r);
}