/** RoomBehavior defines the behavior of a room */
public interface RoomBehavior
{ /** enter lets a player enter a room
    * @param p - the player who wishes to enter
	* @return whether the player successfully opened the door and entered. */
  public boolean enter(PlayerBehavior p);

  /** exit ejects a player from the room.
    * @param p - the player who wishes to leave the room */
  public void exit(PlayerBehavior p);

  /** occupantOf returns the identity of the room's occupant
    * @return the address of the occupant object;
	*    if room unoccupied, return null */
  public PlayerBehavior occupantOf();
}