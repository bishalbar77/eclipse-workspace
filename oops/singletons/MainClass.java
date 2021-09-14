package oops.singletons;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AppConfig ob = new AppConfig();   //when ever object is created constructor is called
		AppConfig ob = AppConfig.getInstance();           //Singleton
		AppConfig ob1 = AppConfig.getInstance();
		AppConfig ob2 = AppConfig.getInstance();
		AppConfig ob3 = AppConfig.getInstance();
		AppConfig ob4 = AppConfig.getInstance();
		/*       object created once     */

	}

}
