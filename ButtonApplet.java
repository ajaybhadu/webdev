/* <applet code=ButtonApplet height=300 width=400> </applet>*/ 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class ButtonApplet extends Applet implements ActionListener 
{ 

String msg = ""; 
Button yes, no, maybe; 
public void init() 
{ 
yes = new Button("Yes"); 
no = new Button("No"); 
maybe = new Button("Undecided"); 
add(yes); 
add(no); 
add(maybe); 
yes.addActionListener(this); 
no.addActionListener(this); 
maybe.addActionListener(this); 
} 
public void actionPerformed(ActionEvent e) 
{ 
String str = e.getActionCommand(); 
if(str.equals("Yes")) 
msg = "You pressed Yes"; 
else if(str.equals("No")) 
msg = "You pressed No"; 
else 
msg = "You pressed Undecided"; 
repaint(); 
} 
public void paint(Graphics g) 
{ 
g.drawString(msg,6,100); } } 
