

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
		Query q = pm.newQuery();
		q.setClass(Director.class);
		q.declareParameters("String name");
		q.setFilter("this.name == name");
		@SuppressWarnings("unchecked")
		Collection<Director> result = (Collection<Director>) q.execute(name);
		Director found = Utility.extract(result);
		return found;

	}

	public Collection<Movie> movies(Query q)

	/* Returns the collection of all movies directed by this director. 
	   Represents the inverse of Movie.director.
	   Sort the result by (title, releaseYear). */

	{
		Director d = this;
		q.setClass(Movie.class);
		q.declareVariables("Movie m");
		q.declareParameters("Director d");
		q.setFilter("this.director.name == d.name");
		q.setOrdering("title ascending, releaseYear ascending");
		@SuppressWarnings("unchecked")
		Collection<Movie> result = (Collection<Movie>) q.execute(d);
		return result;

	}

	public Collection<Studio> studiosWithThisDirector(Query q)

	/* Returns the collection of all studios that have made at least two movies
	   directed by this director.
	   Sort the result by studio name. */

	{
		q.setClass(Studio.class);
		q.declareVariables("Studio s; Movie m");
		q.setFilter("s.movies.contains(m) && m.director == this");
		@SuppressWarnings("unchecked")
		Collection<Studio> result = (Collection<Studio>) q.execute();
		return result;

	}
}

