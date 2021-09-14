package awt;

import java.awt.*;  
class AwtDemo extends Frame{  
	AwtDemo(){  
Frame f=new Frame();  
Button b=new Button("Hii me");  
Label i = new Label("Hi ");
b.setBounds(30,50,80,30);  
f.add(i);  
f.add(b);  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String args[]){  
	AwtDemo f=new AwtDemo();  
}}  
