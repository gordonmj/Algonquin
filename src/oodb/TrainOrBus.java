package oodb;

@javax.jdo.annotations.PersistenceCapable
public class TrainOrBus {

	public String code;

	public TrainOrBus(String c){
		code = c;
	}
}
