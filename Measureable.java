package csc252;
public class Measureable {
	
	/**
	An interface for methods that return
	the perimeter and area of an object.
	*/
	public interface Measurable{
		
	    /** Returns the perimeter. */
	    public double getPerimeter ();
	    /** Returns the area. */
	    public double getArea ();
	    public boolean equals(Object o);
	} 
	
}
