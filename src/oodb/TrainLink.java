package oodb;

import java.util.HashSet;

public class TrainLink extends Link{
	HashSet<TrainNode> from = new HashSet<TrainNode>();
	HashSet<TrainNode> to = new HashSet<TrainNode>();
	
	public TrainLink(){
		super(0);
	}
}
