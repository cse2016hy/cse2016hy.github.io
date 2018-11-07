
public class AdventureGame {
	public static void main(String args[]) {
		RoomBehavior[] ground_floor = new RoomBehavior[4]; 
		ground_floor[0] = new BasicRoom("kitchen", "pasta"); 
		ground_floor[3] = new BasicRoom("lounge", "swordfish");
		Explorer harpo = new Explorer("Harpo Marx", "swordfish"); 
		Explorer chico = new Explorer("Chico Marx", "tomato"); 
		boolean success = chico.explore(ground_floor[3]);
		System.out.println(success);
	}
}
