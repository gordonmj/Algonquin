

import java.util.*;

import javax.jdo.*;

@javax.jdo.annotations.PersistenceCapable

public class Movie
{
	String title;
	int releaseYear;

	Studio studio; // The studio that made this movie
	Director director; // The director of this movie

	HashSet<Actor> actors = new HashSet<Actor>();
	             // The set of actors who acted in this movie


	public String toString()
	{
		return title+" "+releaseYear;
	}

	public static Collection<Movie> sameTitle(Query q)

	/* Returns the collection of all movies each of which has at least
	   one other movie with the same title. 
	   Sort the result by (title, releaseYear). */

	{
		q.setClass(Movie.class);
		q.declareVariables("Movie m");
		q.setFilter("m.title == this.title && m <> this");
		q.setOrdering("title ascending");
		@SuppressWarnings("unchecked")
		Collection<Movie> result = (Collection<Movie>) q.execute();
		return result;
	}

//	public static Collection<Movie> studioActors(String sName, int x, Query q)
//
//	/* Returns the collection of all movies "m" such that "m" was made by the studio with
//	   the name "sName" and had at least "x" actors acting in it.
//	   Sort the result by (releaseYear, title). */
//
//	{
//
//	}
//
//	public static Collection<Movie> madeByDirectorBetweenTheseYears(Director d, int y1, int y2, Query q)
//
//	/* Returns the collection of all movies made by the director "d" 
//	   between the years "y1" and "y2", inclusive. It is assumed y1 <= y2.
//	   Sort the result by (title, releaseYear). */
//
//	{
//
//	}
//
//	public static Collection<Object[]> allMovieStudioDirectorTuples(Query q)
//
//	/* Returns the collection of 3-tuples <m, s, d> such that movie m was made by studio s and
//	   directed by director d. Sort the result by (m.releaseYear, m.title).
//	   Use q.setResult(...). */
//
//	{
//
//	}
//
//	public static Collection<Object[]> groupMoviesByDirector(Query q)
//
//	/* Group movies by director and count the # of movies in each group.
//	   Returns the collection of 2-tuples <d, n> such that director d directed n movies.
//	   Sort the result by n in increasing order.
//           Use q.setGrouping(...) and q.setResult(...). */
//
//	{
//
//	}
}

