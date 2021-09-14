package pmec_oops;

import java.util.*;
class Area
{
double ar;
Area(float r)
 {
   ar=3.14*r*r;
 }
Area(float l,float b)
 {
   ar=l*b;
 }
Area(float a,float b,float c)
 {
  float s;
  s=(a+b+c)/2;
  ar=s*(s-a)*(s-b)*(s-c);
  ar=Math.pow(ar,0.5);
 }
void Display()
{
  System.out.println("AREA  "+ar);
}

}

class Area1
{
public static void main(String args[])
{
Scanner k=new Scanner(System.in);
int ch;
float x,y,z;
do
{
     System.out.println("1.AREA OF CIRCLE\n");
     System.out.println("2.AREA OF RECTANGLE\n");
     System.out.println("3.AREA OF TRIANGLE\n");
     
     System.out.println("ENTER YOUR CHOICE\n");
     ch=k.nextInt();


    switch(ch)
{

case 1:{
     System.out.println("ENTER THE RADIUS OF CIRCLE\n");
     x=k.nextFloat();
     Area t=new Area(x);
     t.Display();
       }break;   

case 2:{
     System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANGLE\n");
     x=k.nextFloat();
     y=k.nextFloat();
     Area p=new Area(x,y);
     p.Display();
       }break;

case 3:{
     System.out.println("ENTER THE THREE SIDES OF TRIANGLE\n");
     x=k.nextFloat();
     y=k.nextFloat();
     Area m=new Area(x,y);
     m.Display();
       }break;
default:
     System.out.println("INVALID CHOICE\n");
}
}while(ch!=4);
}
}