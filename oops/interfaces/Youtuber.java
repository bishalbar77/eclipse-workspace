package oops.interfaces;

public abstract interface Youtuber extends VideoEditor{
	abstract void makevideos();
	
	default void upload()            //this feature is added in java8.0 onwards deafult else there is no body in abstract or inetrference
	{                                // u may use it or not
		
	}
}
