
public class LocationTester {
	public static String foo() {
		Location loc1 = new Location(39.9, 116.4);
		Location loc2 = new Location(55.8, 37.6); 
		loc1 = loc2; 
		loc1.latitude = -8.3;
		return (loc2.latitude + ", " + loc2.longitude);
	}
	public static void main(String[] args) {
		System.out.println(foo());
	}
}
