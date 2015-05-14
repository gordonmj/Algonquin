

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
		q.setClass(Actor.class);
		q.declareParameters("int y1, int y2");
		q.declareVariables("Movie m");
		q.setFilter("this.movies.contains(m) && m.releaseYear>=y1 && m.releaseYear<=y2");
		q.setOrdering("this.name ascending");
		@SuppressWarnings("unchecked")
		Collection<Actor> result = (Collection<Actor>) q.execute(y1,y2);
		return result;
	}

//	public static Collection<Actor> actedForThisStudio(String sName, Query q)
//
//	/* Returns the collection of all actors who acted in a movie made by
//	   the studio with the name "sName".
//	   Sort the result by name. */
//
//	{
//
//	}
}
