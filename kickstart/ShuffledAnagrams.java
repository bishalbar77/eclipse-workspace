package kickstart;

import java.util.Scanner;

public class ShuffledAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< n; i++) {
			if(sc.hasNextLine()) {
				String word = sc.nextLine();
				String newWord = null;
				int wordLength = word.length();
				for(int j = 1; j <= word.length(); j++ ) {
					boolean flag = true;
					newWord = leftrotate(word, 1);
					for(int k = 0; k < wordLength; k++) {
						if(newWord.charAt(k) == word.charAt(k)) {
							flag = false;
						}
					}
					if(flag)
						System.out.println(newWord);
						break;
				}
				sc.nextLine();
				System.out.println("IMPOSSIBLE");
			}
		}
	}
	
	static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }

}
