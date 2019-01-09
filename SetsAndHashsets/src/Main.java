import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	
	private static Map<String,HeavenlyBody> solarSystem= new HashMap<>();
	private static Set<HeavenlyBody> planet=new HashSet<>();
	
	
	
	public static void main(String[] args) {
		
		    HeavenlyBody temp=new HeavenlyBody("Mercury",88);
		    solarSystem.put(temp.getName(), temp);
		    planet.add(temp);
		
		    temp=new HeavenlyBody("Venus",255);
		    solarSystem.put(temp.getName(), temp);
		    planet.add(temp);
		
		    temp=new HeavenlyBody("Earth",365);
		    solarSystem.put(temp.getName(), temp);
		    planet.add(temp);
		
		    
		    HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon);

	        temp = new HeavenlyBody("Mars", 687);
	        solarSystem.put(temp.getName(), temp);
	        planet.add(temp);

	        tempMoon = new HeavenlyBody("Deimos", 1.3);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); 

	        tempMoon = new HeavenlyBody("Phobos", 0.3);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); 

	        temp = new HeavenlyBody("Jupiter", 4332);
	        solarSystem.put(temp.getName(), temp);
	        planet.add(temp);

	        tempMoon = new HeavenlyBody("Io", 1.8);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); 

	        tempMoon = new HeavenlyBody("Europa", 3.5);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); 

	        tempMoon = new HeavenlyBody("Ganymede", 7.1);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); 

	        tempMoon = new HeavenlyBody("Callisto", 16.7);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); 

	        temp = new HeavenlyBody("Saturn", 10759);
	        solarSystem.put(temp.getName(), temp);
	        planet.add(temp);

	        temp = new HeavenlyBody("Uranus", 30660);
	        solarSystem.put(temp.getName(), temp);
	        planet.add(temp);

	        temp = new HeavenlyBody("Neptune", 165);
	        solarSystem.put(temp.getName(), temp);
	        planet.add(temp);

	        temp = new HeavenlyBody("Pluto", 248);
	        solarSystem.put(temp.getName(), temp);
	        planet.add(temp);
	
	    
	        System.out.println("Planets");
	        for(HeavenlyBody planet : planet) {
	            System.out.println("\t" + planet.getName());
	        }

	        HeavenlyBody body = solarSystem.get("Mars");
	        System.out.println("Moons of " + body.getName());
	        for(HeavenlyBody jupiterMoon: body.getSatelites()) {
	            System.out.println("\t" + jupiterMoon.getName());
	        }
	        

	        Set<HeavenlyBody> moons = new HashSet<>();
	        for(HeavenlyBody planet : planet) {
	            moons.addAll(planet.getSatelites());
	        }

	        System.out.println("All Moons");
	        for(HeavenlyBody moon : moons) {
	            System.out.println("\t" + moon.getName());
	        }
			
	}

}