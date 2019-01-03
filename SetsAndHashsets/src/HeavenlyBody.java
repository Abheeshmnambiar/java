import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private Set<HeavenlyBody> satelites;
	
	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satelites=new HashSet<>();
	}
	
	
	public String getName() {
		return name;
	}
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public boolean addMoon(HeavenlyBody moon) {
	    return this.satelites.add(moon);	
	}
	
	public Set<HeavenlyBody> getSatelites(){
		
		return new HashSet<>(this.satelites);
	}

}
