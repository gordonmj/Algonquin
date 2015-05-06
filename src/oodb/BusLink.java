package oodb;
import java.util.*;

@javax.jdo.annotations.PersistenceCapable
public class BusLink extends Link{

	HashSet<BusNode> from  = new HashSet<BusNode>();
	HashSet<BusNode> to = new HashSet<BusNode>();
	
	public BusLink(double d){
		super(d);
	}
}
