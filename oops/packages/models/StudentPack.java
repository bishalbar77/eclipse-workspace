package oops.packages.models;

public class StudentPack {
	private String name;
	public StudentPack(String name){
		this.name = name;
		
	}
	public String getName() {
		return name;
		
	}
	 String getPass()
	{
		System.out.println("no password");
		return "rtsghjdf";
	}
}
