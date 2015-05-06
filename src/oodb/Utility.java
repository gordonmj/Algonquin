package oodb;

import java.util.*;
import javax.jdo.*;

public abstract class Utility
{
	public static <T> void printCollection(Collection<T> c)
	{
		for ( T x: c )
			System.out.println( x );
	}

	public static <T> T extract(Collection<T> c)

	/* Returns the last element of collection c, "last" according to the order of
	   the iteration of the for-loop. In particular, if c contains only one element,
	   that element is returned. If c is empty, null is returned. */

	{
		T x = null;
		for ( T e: c )
			x = e;
		return x;
	}
}