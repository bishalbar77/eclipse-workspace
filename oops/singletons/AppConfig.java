package oops.singletons;

public class AppConfig {
	private AppConfig()
	{
		
	}
	private static AppConfig ob = null;   //no initial memory required
	public static AppConfig getInstance()
	{
		if(ob==null)
		{
			ob = new AppConfig();
		}
		return ob;
	}
}
