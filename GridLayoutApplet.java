
/*<applet code=GridLayoutApplet width=100 height=100> 
</applet>*/ 

import java.applet.Applet; 
import java.awt.*; 
public class GridLayoutApplet extends Applet 
{ 
private Button one,two,three,four,five,six,seven,eight,nine,ten; 
public void init() 
{ 
Panel panel=new Panel(); 
one=new Button("1"); 
two=new Button("2"); 
three=new Button("3"); 
four=new Button("4"); 
five=new Button("5"); 
six=new Button("6"); 
seven=new Button("7"); 
eight=new Button("8"); 
nine=new Button("9"); 
ten=new Button("10"); 
panel.setLayout(new GridLayout(3,0,10,10)); 
panel.add(one); 
panel.add(two); 
panel.add(three); 
panel.add(four); 
panel.add(five); 
panel.add(six); 
panel.add(seven); 
panel.add(eight); 
panel.add(nine); 
panel.add(ten); 
setLayout(new BorderLayout()); 
add(panel,BorderLayout.CENTER); 
} 
public void paint(Graphics g) 
{} 
}
