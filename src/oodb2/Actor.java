package oodb2;

import java.util.*;
import javax.jdo.*;

@javax.jdo.annotations.PersistenceCapable

public class Actor extends Person
{
	HashSet<Movie> movies = new HashSet<Movie>();
	      // The set of movies in which this actor acted


	public static Collection<Actor> actedBetweenTheseYears(int y1, int y2, Query q)

	/* Returns the collection of all actors who acted in a movie 
	   made between the years "y1" and "y2", inclusive. It is assumed y1 <= y2.
	   Sort the result by name. */

	{

	}

	public static Collection<Actor> actedForThisStudio(String sName, Query q)

	/* Returns the collection of all actors who acted in a movie made by
	   the studio with the name "sName".
	   Sort the result by name. */

	{

	}
}
