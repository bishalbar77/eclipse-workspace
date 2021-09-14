package pmec_oops;

public class Delete {

	public static void main(String[] args) {
		int[] LA = new int[]{ 5,2,7,9,6};
		int K=2;
		int count=0; 
		System.out.print("Before deletion :- ");
		for(int i=0;i<=4;i++) {
			System.out.print(LA[i]+" ");
			}
		for(int J=0;J<4;J++) {
		count++;
			if(J==K) {
				LA[J]=LA[J+1];
				K++;
			}
		}
		System.out.print("\nAfter deletion  :- ");
		for(int i=0;i<4;i++) {
			System.out.print(LA[i]+" ");
		}
		System.out.println("\nIteration count :- "+count);
	}
}
