package pattern;

public class Pattern6 {

	public static void main(String args[]) {
		for(int i=1;i<=5;i++) {
			for(int j=i; j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int k=9, i=1;i<=5;i++,k--) {
			for(int j=5;j<=k;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
