package oodb2;

import java.util.*;
import javax.jdo.*;

@javax.jdo.annotations.PersistenceCapable

public class Studio
{
	String name; // key

	HashSet<Movie> movies = new HashSet<Movie>();
	             // The set of movies made by this studio


	public String toString()
	{
		return name;
	}

//	public static Studio find(String sName, PersistenceManager pm)
//
//	/* Returns the studio with the given name "sName";
//           if no such studio exists, null is returned. 
//           The function is applied to the database held by the persistence manager "pm". */
//
//	{
//
//	}
//
//	public static Collection<Studio> studiosWithThisActor(String aName, Query q)
//
//	/* Returns the collection of all studios that have made at least one movie
//	   in which an actor with the name "aName" acted.
//	   Sort the result by studio name. */
//
//	{
//
//	}
//
//	public static Collection<Studio> studiosMinimumActors(int x, Query q)
//
//	/* Returns the collection of all studios that have made a movie in which at least "x" actors acted.
//	   Sort the result by studio name. */
//
//	{
//
//	}

//	public static Collection<Studio> studiosInThisYear(int yr, Query q)
//
//	/* Returns the collection of all studios "s" that satisfy the following condition:
//
//	   "s" has made at least one movie released in year "yr" that had
//	   an actor that acted in another movie which was released in the same year "yr" and
//	   was NOT made by the studio "s".
//
//	   Sort the result by studio name. */
//
//	{
//
//	}
}

