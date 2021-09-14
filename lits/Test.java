package lits;

class prob1{
int puzzel(int n){
int result;
if (n==1)
return 1;
result = puzzel(n-1) * n;
return result;
}
}
class Test{
	 public static void main(String args[ ]) 
     {    
          int a = 1;
          int b = 2;
          int c;
          int d;
          c = ++b;
          d = a++;
          c++;
          b++;
          ++a;
          System.out.println(a + " " + b + " " + c);
     } 
}
