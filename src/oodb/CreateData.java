package oodb;

import javax.persistence.*;

import java.util.*;

public class CreateData {

	public static TrainNode[] trainNodes = new TrainNode[10];
	public static TrainLink[] trainLinks = new TrainLink[10];
	public static void main(String[] args){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$Algonquin/transportation.odb");
            EntityManager em = emf.createEntityManager();
		TransportationNetwork transitSystem = new TransportationNetwork("Transit System");
        em.getTransaction().begin();

		trainLinks[0] = new TrainLink(1.0);
		transitSystem.links.add(trainLinks[0]);
		System.out.println("Creating a train link with distance "+trainLinks[0].distance);
		em.persist(trainLinks[0]);
		for (int t=0;t<5;t++){
			trainLinks[t+1] = new TrainLink(5.0);
			System.out.println("Creating a train link with distance "+trainLinks[t+1].distance);
			transitSystem.links.add(trainLinks[t+1]);
			em.persist(trainLinks[t+1]);
			trainNodes[t] = new TrainNode("Node "+t);
			System.out.println("Creating a train node named "+trainNodes[t].name);
			transitSystem.nodes.add(trainNodes[t]);
			em.persist(trainNodes[t]);
			trainLinks[t].from.add(trainNodes[t]);
			trainLinks[t+1].to.add(trainNodes[t]);
			System.out.println("Linking node to links.");
		}
        em.getTransaction().commit();
        em.close();
        emf.close();
	}
}
