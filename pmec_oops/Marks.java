package pmec_oops;

public abstract class Marks {
	 abstract void getPercentage();
	public void getPercentage(int subjects, int marks[]) {
		int percent =0;
		for( int i : marks)
			percent += i;
		System.out.println("Percentage of student is "+(percent/subjects));
	}
}
