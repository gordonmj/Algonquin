package oodb;


import java.util.HashSet;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public class TrainLink extends Link{
	public HashSet<TrainNode> from = new HashSet<TrainNode>();
	public HashSet<TrainNode> to = new HashSet<TrainNode>();
	
	public TrainLink(double d){
		super(d);
	}
}
