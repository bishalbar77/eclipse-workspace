package encapsulation;

public class Student {
	private String name;
	private int rool;
	
	public int getRool()
	{
		return rool;
	}
	public void setRool(int rool)
	{
		if(rool>100)
		{
			System.out.println("Not from sec B");
		}
		else
		{
			System.out.println("From SEction B");
		this.rool = rool;
		}	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
