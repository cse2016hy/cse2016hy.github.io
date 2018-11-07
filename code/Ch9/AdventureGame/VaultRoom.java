/** VaultRoom is a room that holds a treasure --- it is constructed from
  * a class BasicRoom, by means of inheritance, plus the structure below */
public class VaultRoom extends BasicRoom implements Treasury
  // because BasicRoom implements RoomBehavior, so does VaultRoom
{ private TreasureProperty valuable; // the treasure item held in this room

  /** Constructor VaultRoom builds the room.
    * @param name - the room's name
	* @param password - the secret word for entry into the room
	* @param item - the treasure to be saved in the room */
  public VaultRoom(String name, String password, TreasureProperty item)
  { // first, invoke class BasicRoom's constructor method:
    super(name, password); // "super" means "superclass"
	                       // Must be invoked as the 1st statement!!!
	valuable = item;
  }

  public TreasureProperty yieldTreasure(PlayerBehavior p)
  { TreasureProperty answer = null;
    if ( p == occupantOf() ) // invokes the occupantOf method in BasicRoom
	                         // You can also state, super.occupantOf()
							 // Another format is, this.occupantOf()
	  { answer = valuable;
	    valuable = null;
	  }
	return answer;
  }
}