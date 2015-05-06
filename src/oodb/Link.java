package oodb;

@javax.jdo.annotations.PersistenceCapable
public abstract class Link {

	public double distance;
	
	public Link(double d){
		distance = d;
	}
}
