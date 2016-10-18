/* <applet code=CheckBoxApplet width=300 height=400></applet>*/ 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class CheckBoxApplet extends Applet implements ItemListener 
{ 
Checkbox be,me,mtech,bsc,msc; 
Checkbox music,sport,read,stamp; 
CheckboxGroup cbg; 
Label lbldegree,lblhobby; 
String msg; 
public void init() 
{ 
lbldegree = new Label("Degree : "); 
lblhobby = new Label("Hobby :"); 
cbg = new CheckboxGroup(); 
be = new Checkbox("B.E",cbg,true); 
me = new Checkbox("M.E",cbg,false); 
mtech = new Checkbox("M.Tech",cbg,false); 
bsc = new Checkbox("B.Sc.",cbg,false); 
msc = new Checkbox("M.Sc.",cbg,false); 
be.addItemListener(this); 
me.addItemListener(this); 
mtech.addItemListener(this); 
bsc.addItemListener(this); 
msc.addItemListener(this); 
add(lbldegree); 
add(be); 
add(me); 
add(mtech); 
add(bsc); 
add(msc); 
music = new Checkbox("Listening Music"); 
sport = new Checkbox("Playing Sports"); 
read = new Checkbox("Reading Novels"); 
stamp = new Checkbox("Collecting Stamps"); 
music.addItemListener(this); 
sport.addItemListener(this); 
read.addItemListener(this); 
stamp.addItemListener(this); 
add(lblhobby); 
add(music); 
add(sport); 
add(read); 
add(stamp); 
} 
public void itemStateChanged(ItemEvent ie) 
{ 
repaint(); 
} 
public void paint(Graphics g) 
{ 
msg = " Summary : You are pursuing your "; 
msg+= ((Checkbox)cbg.getSelectedCheckbox()).getLabel(); 
msg+= " degree"; 
g.drawString(msg,200,200); 
msg="Your hobbies are: "; 
if(music.getState()==true) 
msg+=music.getLabel()+" " ; 
if(sport.getState()==true) 

msg+=sport.getLabel()+" "; 
if(read.getState()==true) 
msg+=read.getLabel()+" "; 
if(stamp.getState()==true) 
msg+=stamp.getLabel()+" "; 
g.drawString(msg,200,300); 
} 
} 
