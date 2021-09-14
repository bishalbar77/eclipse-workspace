package pmec_oops;

public class Cars {

	    String Brand;
	    
	    Cars(String Brand)
	    {
	        this.Brand = Brand;
	    }
	    
	    public void getBrand()
	    {
	        System.out.println("Name of Brand : " + Brand);
	    }
	    
	    public static void main (String arg[])
	    {
	        
	    	Cars car1 = new Cars("Ford");
	    	car1.getBrand();
	       
	    }

}
