package oodb;
import java.util.*;

@javax.jdo.annotations.PersistenceCapable
public class TransportationNetwork {

	public String code;
	public HashSet<Node> nodes = new HashSet<Node>();
	public HashSet<Link> links = new HashSet<Link>();
	public HashSet<TrainOrBus> trainsOrBuses = new HashSet<TrainOrBus>();
	
	
	public TransportationNetwork(){
		
	}
	
	public TransportationNetwork(String c){
		code = c;
	}
	
	public String getCode(){
		return code;
	}
	
	public void setCode(String c){
		code = c;
	}
	
}
