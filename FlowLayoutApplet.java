/* <applet code=FlowLayoutApplet height=400 width=600> </applet>*/ 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class FlowLayoutApplet extends Applet 
{ 
Button[] b; 
Panel p1,p2,p3; 
public void init() 
{ 
setLayout(new GridLayout(3,1)); 
p1 = new Panel(); 
p1.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
add(p1); 
p2 = new Panel(); 
p2.setLayout(new FlowLayout(FlowLayout.LEFT)); 
add(p2); 
p3 = new Panel(); 
p3.setLayout(new FlowLayout(FlowLayout.CENTER)); 
add(p3); 
b = new Button[15]; 
for(int i=0;i<15;i++) 
{ 
b[i] = new Button(); 
b[i].setLabel("Button"+(i+1)); 
p1.add(b[i]); 
} 
for(int i=0;i<15;i++) 
{ 
b[i] = new Button(); 
b[i].setLabel("Button"+(i+1)); 


p2.add(b[i]); 
} 
for(int i=0;i<15;i++) 
{ 
b[i] = new Button(); 
b[i].setLabel("Button"+(i+1)); 
p3.add(b[i]); 
} 
} 
} 
