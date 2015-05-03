package oodb;

public abstract class TransportationNetwork {

	public String code;

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
