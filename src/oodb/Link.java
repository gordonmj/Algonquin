package oodb;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public abstract class Link {

	public double distance;
	
	public Link(double d){
		distance = d;
	}
}
