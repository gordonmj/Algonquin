package oodb;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public class TrainOrBus {

	public String code;

	public TrainOrBus(String c){
		code = c;
	}
}
