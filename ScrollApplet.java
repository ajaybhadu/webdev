/* <applet code=ScrollApplet height = 400 width = 600> 
</applet> */ 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class ScrollApplet extends Applet implements AdjustmentListener{ 
Scrollbar red; 
Scrollbar green; 
Scrollbar blue; 
Panel scrollpanel; 
Label lred,lgreen,lblue; 
public void init(){ 
//red.setMinimumSize(100); 
red = new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255); 
red.setUnitIncrement(10); 
red.addAdjustmentListener(this); 
green = new Scrollbar(Scrollbar.HORIZONTAL,40,1,0,255); 
green.setUnitIncrement(20); 
green.addAdjustmentListener(this); 
blue = new Scrollbar(Scrollbar.HORIZONTAL,50,1,0,255); 
blue.setUnitIncrement(30); 
blue.addAdjustmentListener(this); 
lred = new Label("RED"); 
lgreen = new Label("GREEN"); 
lblue = new Label("BLUE"); 
scrollpanel = new Panel(); 
scrollpanel.setLayout(new GridLayout(3,2)); 
scrollpanel.add(lred); 
scrollpanel.add(red); 
scrollpanel.add(lgreen); 
scrollpanel.add(green); 
scrollpanel.add(lblue); 
scrollpanel.add(blue); 
add(scrollpanel); 
} 
public void adjustmentValueChanged(AdjustmentEvent ae){ 
repaint(); 
}  
public void paint(Graphics g){ 
Color mycolor = new Color(red.getValue(),green.getValue(),blue.getValue()); 
g.setColor(mycolor); 
g.fillRect(100,250,150,300); 
} 
} 
