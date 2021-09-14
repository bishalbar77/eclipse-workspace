package pmec_oops;

public class GreatestSmallestMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {5, 12, 45, 65, 78};
		double doubleArray[] = {95.8, 12.56, 56.4 ,168 ,48.2};
		float floatArray[] = { 12.5f, 23.5f, 44.2f, 39.5f, 25.1f};
		GS(intArray);
		GS(doubleArray);
		GS(floatArray);
	}

	private static void GS(double array[]) {
		// TODO Auto-generated method stub
		double largest=array[0], smallest=array[0];
		for(int i=0;i<5;i++)
		{
			if(array[i] > largest)
				largest = array[i];
			if(array[i] < smallest)
				smallest = array[i];
		}
		System.out.println("The largest and smallest double number is "+largest+" and "+smallest+".");
	}

	private static void GS(float array[]) {
		float largest=array[0], smallest=array[0];
		for(int i=0;i<5;i++)
		{
			if(array[i] > largest)
				largest = array[i];
			if(array[i] < smallest)
				smallest = array[i];
		}
		System.out.println("The largest and smallest float number is "+largest+" and "+smallest+".");
	}

	private static void GS(int array[]) {
		int largest=array[0], smallest=array[0];
		for(int i=0;i<5;i++)
		{
			if(array[i] > largest)
				largest = array[i];
			if(array[i] < smallest)
				smallest = array[i];
		}
		System.out.println("The largest and smallest integer number is "+largest+" and "+smallest+".");
	}

}
