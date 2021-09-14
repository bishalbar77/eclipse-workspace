package stringtest;

public class FunString {

	public static void main(String[] args) 
	{
		String name ="Bishal"; 
		int n= 50;
		String s = Integer.toString(n);
		System.out.println(s);// Initialization by literals  recommended              Only Pool
		String AnoName = new String("Bishal");    //Initialization by new object                          Heap+pool
		String bar ="Bishal";
		String name2 ="";
		name = name + " Kumar";                   // + operator is ooverloaded in java so it concat 2 string
		String Bike ="CBZ,FZ,ZMR,Honda,Activa";
		String arrBike[] = Bike.split(",");
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.substring(2,3));
		System.out.println(name.contains("shal"));
		System.out.println(name.concat(" Rana"));
		System.out.println(name.replace("Bi","Va"));
		System.out.println(name.toLowerCase());      // indexof is viseversa 
		for(String  i:arrBike)
		System.out.println(i);

	}

}
