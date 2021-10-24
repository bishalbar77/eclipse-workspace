package strings;

public class MutabilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bishal";
		String str1 = "Bishal";
		// FLy weight pattern :- 2 variable using the same reference
        System.out.println( System.identityHashCode(str));
        System.out.println( System.identityHashCode(str1));
        
        StringBuffer str4 = new StringBuffer("Bishal");
        StringBuffer str5 = new StringBuffer("Bishal");
        System.out.println( System.identityHashCode(str4));
        System.out.println( System.identityHashCode(str5));
	}

}
