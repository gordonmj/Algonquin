package oodb;

import javax.jdo.PersistenceManager;
//import javax.persistence.spi.PersistenceUnitInfo;
import com.objectdb.Utilities;

public class CreateData {

	public static TrainNode[] trainNodes = new TrainNode[10];
	public static TrainLink[] trainLinks = new TrainLink[10];
	public static void main(String[] args){
		PersistenceManager pm = Utilities.getPersistenceManager("Algonquin/transportation.odb");
		TransportationNetwork transitSystem = new TransportationNetwork("Transit System");
		pm.currentTransaction().begin();
		trainLinks[0] = new TrainLink(1.0);
		transitSystem.links.add(trainLinks[0]);
		pm.makePersistent(trainLinks[0]);
		for (int t=0;t<5;t++){
			trainLinks[t+1] = new TrainLink(5.0);
			transitSystem.links.add(trainLinks[t+1]);
			pm.makePersistent(trainLinks[t+1]);
			trainNodes[t] = new TrainNode("Train "+t);
			transitSystem.nodes.add(trainNodes[t]);
			pm.makePersistent(trainNodes[t]);
			trainLinks[t].from.add(trainNodes[t]);
			trainLinks[t+1].to.add(trainNodes[t]);
			System.out.println("Making stuff.");
		}
		pm.currentTransaction().commit();
		pm.close();
		
	}
}
