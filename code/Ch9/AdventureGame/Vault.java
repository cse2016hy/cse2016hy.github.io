public class Vault implements RoomBehavior, Treasury
{ private PlayerBehavior occupant; // who is inside the room at the moment
  private String rooms_name;
  private String secret_word; // the password for room entry

  private TreasureProperty valuable; // the treasure item held in this room

  /** Constructor Vault builds the room.
    * @param name - the room's name
	* @param password - the secret word for entry into the room
	* @param item - the treasure to be saved in the room */
  public Vault(String name, String password, TreasureProperty item)
  { occupant = null;
    rooms_name = name;
	secret_word = password;
	valuable = item;
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

  public TreasureProperty yieldTreasure(PlayerBehavior p)
  { TreasureProperty answer = null;
    if ( p == occupant )
       { answer = valuable;
	     valuable = null;
       }
    return answer;
  }
}