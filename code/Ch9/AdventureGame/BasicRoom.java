/** BasicRoom models a room that can have at most one resident at a time */
public class BasicRoom implements RoomBehavior
{ private PlayerBehavior occupant; // who is inside the room at the moment
  private String rooms_name;
  private String secret_word; // the password for room entry

  /** Constructor BasicRoom builds the room.
    * @param name - the room's name
	* @param password - the secret word for entry into the room */
  public BasicRoom(String name, String password)
  { occupant = null; // no one is in the room initially
    rooms_name = name;
	secret_word = password;
  }

  public boolean enter(PlayerBehavior p)
  { boolean result = false;
    if ( occupant == null && secret_word.equals(p.speak()) )
	  { occupant = p;
	    result = true;
	  }
	return result;
  }

  public void exit(PlayerBehavior p)
  { if ( occupant == p) // is p indeed in this room at the moment?
      { occupant = null; }
  }

  public PlayerBehavior occupantOf()
  { return occupant; }
}
