package stringtest;

import java.nio.charset.Charset;

public class StringConstructors {
	  public static void main(String[] args) {
		    byte[] byteArray = { 76, 117, 99, 107, 121};
		    String byteType = new String(byteArray);
		    System.out.println(byteType);
		    Charset CharsetType = Charset.defaultCharset();
		    String charset = new String(byteArray, CharsetType);
		    System.out.println(charset);
		    String schar = new String(byteArray, 1, 3, CharsetType);
		    System.out.println(schar);

		    char characters[] = {
		      'L',
		      'U',
		      'K',
		      'K',
		      'Y'
		    };
		    String char1 = new String(characters);
		    System.out.println(char1);

		    String char2 = new String(characters, 1, 3);
		    System.out.println(char2);
		  }
}
