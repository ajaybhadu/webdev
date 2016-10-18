import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
/*<applet code=BorderLayoutApplet width=300 height=100> 
</applet>*/ 
public class BorderLayoutApplet extends Applet implements ActionListener{ 
Button green=new Button("green"); 
Button red=new Button("red"); 
Button blue=new Button("blue"); 
Button font=new Button("font"); 
String msg="Sethu"; 
TextArea area; 
public void init() 
{ 
setLayout(new BorderLayout()); 
area = new TextArea(); 
area.setText(msg); 
add(green,BorderLayout.NORTH); 
add(red,BorderLayout.SOUTH); 
add(blue,BorderLayout.EAST); 
add(font,BorderLayout.WEST); 
add(area,BorderLayout.CENTER); 
green.addActionListener(this); 
red.addActionListener(this); 
blue.addActionListener(this); 
font.addActionListener(this); 
}
public void actionPerformed (ActionEvent a) 
{ 
String str= a.getActionCommand(); 
if(str.equals("green")) 
{ 
area.setForeground(Color.green); 
} 
else if(str.equals("red")) 
{ 
area.setForeground(Color.red); 
} 
else if(str.equals("blue")) 
{ 
area.setForeground(Color.blue); 
} 
else 
{ 
Font myfont = new Font("Garamond",Font.BOLD,25); 
area.setFont(myfont); 
area.setForeground(Color.cyan); 
} 
repaint(); 
} 
public void paint(Graphics g) 
{} 
} 
