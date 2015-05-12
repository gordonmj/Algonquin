package oodb2;

import java.util.*;
import javax.jdo.*;

@javax.jdo.annotations.PersistenceCapable

public class Director extends Person
{

	public static Director find(String name, PersistenceManager pm)

	/* Returns a director with the given "name";
           if no such director exists, null is returned. 
           The function is applied to the database held by the persistence manager "pm". */

	{

	}

	public Collection<Movie> movies(Query q)

	/* Returns the collection of all movies directed by this director. 
	   Represents the inverse of Movie.director.
	   Sort the result by (title, releaseYear). */

	{

	}

	public Collection<Studio> studiosWithThisDirector(Query q)

	/* Returns the collection of all studios that have made at least two movies
	   directed by this director.
	   Sort the result by studio name. */

	{

	}
}

