package pmec_oops;

public class Exam {
	public static void main(String args[]) {
		int a[] = {2,3,2} ,b;
		for(int i=1;i<a.length;i++) {
			b = a[++i];
			System.out.println(String.format("(i = %d, b = %d)", i,b));
		}
	}
}
