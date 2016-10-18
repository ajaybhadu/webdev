/* <applet code = ChoiceApplet height = 400 width = 600> 
</applet> */ 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class ChoiceApplet extends Applet implements ItemListener{ 
Choice fonts; 
public void init(){ 
fonts = new Choice(); 
fonts.add("Arial"); 
fonts.add("Arial Black"); 
fonts.add("Book Antiqua"); 
fonts.add("Bookman Old Style"); 
fonts.add("Garamond"); 
fonts.add("Symbol"); 
fonts.addItemListener(this); 
add(fonts); 
} 
public void itemStateChanged(ItemEvent ie){ 
repaint(); 
} 
public void paint(Graphics g){ 
String name = fonts.getSelectedItem(); 
Font myFont = new Font(name,Font.PLAIN,30); 
g.setFont(myFont); 
g.drawString("The New Font Selected Is "+name, 100,300); 
} 
} 
