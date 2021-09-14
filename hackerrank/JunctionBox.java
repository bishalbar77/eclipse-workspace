package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class JunctionBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayLines = new ArrayList<>();
        String line;
        while(true){
            line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            else {
              arrayLines.add(line);
    
            }
        }
        for(int i=0;i<arrayLines.size();i++) {
        	String[] individualBox = arrayLines.toArray(new String[i]);
        }
        printer(arrayLines);
		
	}
	
	public static void printer(ArrayList<String> arrayLines) {
		int[] array = {5, 2, 4, 1,0,3};
		for(int i=0;i<arrayLines.size();i++) {
			System.out.println(arrayLines.get(array[i]));
		}
	}
	 public static boolean isAlphaNumeric(String str)
	    {
	        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
	 
	        Pattern p = Pattern.compile(regex);
	 
	        if (str == null) {
	            return false;
	        }
	        Matcher m = p.matcher(str);
	        return m.matches();
	    }

}
