package oodb;
import java.util.*;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public class BusLink extends Link{

	HashSet<BusNode> from  = new HashSet<BusNode>();
	HashSet<BusNode> to = new HashSet<BusNode>();
	
	public BusLink(double d){
		super(d);
	}
}
