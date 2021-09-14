package oops.exceptionhandling;

public class MainClass {

	public static void main(String[] args) 
	{
      //TODO Auto-generated method stub
//		try 
//		{
////			func1();
////			System.out.println(5/0);
//			int a[] =new int[5];
//			System.out.println(a[6]);
//	    } 
//	
//		catch(ArithmeticException e)                                                  // this is checked by JRE
//		{
//	    	System.out.println(e.getMessage()+ " occured, check code");               //e. for that u can get every type of details about our exception
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("catch2:- Index out of bounds");
//		}
//		catch(IllegalArgumentException e)
//		{
//			System.out.println("CHcek your casting carefully");
//		}
//		finally {
//			System.out.println("Sorry for the problem its reun al ways");              //runs always
//		}
//		System.out.println("This statement won't print if there is no exception handling");
		func1();
	}
	static void func1()
	{
		System.out.println("1st Statement");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    
		System.out.println("after 3000 mili seconds");
		try {
			                                    //sleep for 1000 milisec
		fun2();
		}
		catch(Exception e)
		{
			System.out.println("fuunction 2 helped the exception");
		}
	}
	static void fun2() throws ArrayIndexOutOfBoundsException {                       //to say some function might give an expection
																					 //predicting an exception
		boolean a =true;
		if(a)
		{
			throw new ArrayIndexOutOfBoundsException("Not compilable");                //explicity exception thowing by creating an exception object
		}
	}
}
