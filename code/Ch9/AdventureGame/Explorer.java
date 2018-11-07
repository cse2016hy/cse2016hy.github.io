/** Explorer models a player who explores and remembers rooms */
public class Explorer implements PlayerBehavior
{ private String my_name;
  private String my_secret_word; // a password for entering rooms
  private RoomBehavior where_I_am_now; // the room this object occupies

  /** Constuctor Explorer builds the Player
    * @param name - the player's name
	* @param word - the password the player can speak */
  public Explorer(String name, String word)
  { my_name = name;
    my_secret_word = word;
	where_I_am_now = null; // player does not start inside any room
  }

  public String speak()
  { return my_secret_word; }

  /** exitRoom causes the player to leave the room it occupies, if any */
  public void exitRoom()
  { if ( where_I_am_now != null )
       { where_I_am_now.exit(this); // exit the room
         where_I_am_now = null;
	   }
  }

  public boolean explore(RoomBehavior r)
  { if ( where_I_am_now != null )
	   { exitRoom(); } // exit current room to go to room r:
    boolean went_inside = r.enter(this); // "this" means "this object"
	if ( went_inside )
	   { where_I_am_now = r; }
	return went_inside;
  }
  
  /** locationOf returns the room that is occupied by this player */
  public RoomBehavior locationOf()
  { return where_I_am_now; }
}
