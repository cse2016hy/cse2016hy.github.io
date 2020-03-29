import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * Hello Unfolding World.
 * 
 * Download the distribution with examples for many more examples and features.
 */
public class HelloUnfoldingWorld extends PApplet {

	UnfoldingMap map;
	Location start; 
	
	public void setup() {
		size(800, 600, OPENGL);
		start = new Location(37.32f, 126.83f);
		SimplePointMarker ericaMarker = new SimplePointMarker(start);
		
		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(10, start);
		map.addMarker(ericaMarker);

		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {
		map.draw();
	    Location location = map.getLocation(mouseX, mouseY);
	    fill(0);
	    text(location.getLat() + ", " + location.getLon() + " - " + location.getDistance(start), mouseX, mouseY);
//		background(0);
//		map.draw();
	}

}
