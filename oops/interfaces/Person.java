package oops.interfaces;


public class Person implements Boxer {
	public static void main(String[] args)
	{
		Person personObj = new Person();
		Boxer boxerObj = personObj;
		boxerObj.boxing(100, "Bishal");
		boxerObj.arena("Boys Hostel 2");
		boxerObj.time("11:29 PM");
		boxerObj.message();
	}

	@Override
	public void boxing(int punches, String name) {
		System.out.println(name+" got "+punches+" punches");
	}
	
	public void arena(String arenaName) {
		System.out.println(arenaName);
	}

	@Override
	public void time(String time) {
		// TODO Auto-generated method stub
		System.out.println("Time is "+time);
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.print("Please come to match");
	}



}
