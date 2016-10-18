/*<applet code=cardLayoutApplet width=600 height=400> 
</applet>*/ 
import java.awt.event.*; 
import java.awt.*; 
import java.applet.Applet; 
import java.awt.event.ActionListener; 
public class cardLayoutApplet extends Applet implements ActionListener 
{ 
private Button tiny,large,medium,small; 
private Panel cardpanel=new Panel(); 
private Panel tinypanel=new Panel(); 
private Panel smallpanel=new Panel(); 
private Panel medpanel=new Panel(); 
private Panel largepanel=new Panel(); 
private CardLayout card=new CardLayout(10,5); 
public void init() 
{ 
cardpanel.setLayout(card); 
tinypanel.setLayout(new BorderLayout()); 

smallpanel.setLayout(new BorderLayout()); 
medpanel.setLayout(new BorderLayout()); 
largepanel.setLayout(new BorderLayout()); 
tiny=new Button("Tiny CardLayout"); 
small=new Button("Small CardLayout"); 
medium=new Button("Medium CardLayout"); 
large=new Button("Large CardLayout"); 
tiny.setFont(new Font("Helvetica",Font.BOLD,20)); 
small.setFont(new Font("Times-Roman",Font.BOLD,12)); 
medium.setFont(new Font("Arial",Font.BOLD,23)); 
large.setFont(new Font("Courier",Font.BOLD,32)); 
tiny.addActionListener(this); 
small.addActionListener(this); 
medium.addActionListener(this); 
large.addActionListener(this); 
tinypanel.add(tiny,BorderLayout.CENTER); 
smallpanel.add(small,BorderLayout.CENTER); 
medpanel.add(medium,BorderLayout.CENTER); 
largepanel.add(large,BorderLayout.CENTER); 
cardpanel.add("tiny",tinypanel); 
cardpanel.add("small",smallpanel); 
cardpanel.add("medium",medpanel); 
cardpanel.add("large",largepanel); 
setLayout(new BorderLayout()); 
add(cardpanel,BorderLayout.CENTER); 
} 
public void actionPerformed(ActionEvent e) 
{ 
card.next(cardpanel); 
} 
}
