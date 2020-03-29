
public class Location {
	public double latitude;
	public double longitude; 
	
	public Location(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon; 
	}
	
	public double distance(Location other) {
		double RadiusEarth = 6371.0;   // 지구의 반지름
		double lat1 = this.latitude;
        double lon1 = this.longitude;
        double lat2 = other.latitude;
        double lon2 = other.longitude;
        return RadiusEarth*Math.acos(Math.cos(Math.toRadians(90-lat1))*Math.cos(Math.toRadians(90-lat2))+Math.sin(Math.toRadians(90-lat1))*Math.sin(Math.toRadians(90-lat2))*Math.cos(Math.toRadians(lon1-lon2)));
	}
}
