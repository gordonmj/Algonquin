package oodb;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public class TrainNode extends Node{

	public TrainNode(String s){
		super(s);
	}
}
