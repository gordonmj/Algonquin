package oodb;
import java.util.*;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
public class Schedule {

	HashSet<TrainOrBus> trainOrBus = new HashSet<TrainOrBus>();
	HashSet<Node> node = new HashSet<Node>();
	HashSet<Time> arrivalTime = new HashSet<Time>();
	HashSet<Time> departureTime = new HashSet<Time>();
}
