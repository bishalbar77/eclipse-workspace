package coderByte;

import java.util.*; 
import java.io.*;

class SearchingChallenge {

  public static char SearchingChallenge0(String str) {
	str = str.replaceAll("\\s+"," ").trim();
    char temp[] = new char[str.length()+10], temp2=0; 
    for(int i=0;i<str.length();i++)
    {
     int count=0;
      for(int j=0;j<str.length();j++)
      {
          if(str.charAt(i)==str.charAt(j))
          {
            count++;
          }
      }
      if(count==1)
      {
    	  temp2=str.charAt(i);
    	  break;
      }
    }
    return temp2;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SearchingChallenge0(s.nextLine())); 

  }

}
