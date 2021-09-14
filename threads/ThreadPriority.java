package threads;

public class ThreadPriority extends Thread {
	public void run(){  
		System.out.println("thread is running...");  
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1 = new ThreadPriority();
		t1.start();
	}

}
