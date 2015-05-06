package oodb;
import java.util.*;

@javax.jdo.annotations.PersistenceCapable
public abstract class Node {

	public String name;
	HashSet<Node> near = new HashSet<Node>();
	HashSet<Node> adjacent = new HashSet<Node>();
	
	public Node(String n){
		name = n;
	}

}
