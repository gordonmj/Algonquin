package oodb;
import java.util.*;

public abstract class TransportationNetwork {

	public String code;
	HashSet<Node> nodes;
	HashSet<Link> links = new HashSet<Link>();
	HashSet<TrainOrBus> trainsOrBuses = new HashSet<TrainOrBus>();
	
	
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
