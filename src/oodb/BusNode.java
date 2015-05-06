package oodb;
import java.util.*;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public class BusNode extends Node{

	public BusNode(String s){
		super(s);
	}
}
