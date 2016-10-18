/** <applet code = PurchaseApplet width = 600 height = 400> 
</applet> */ 
import java.awt.*; 
import java.applet.Applet; 
public class PurchaseApplet extends Applet 
{ 
Panel ButtonPanel; 
Label title,name,address,payment,phone,city,state; 
TextField namefield,addressfield,cityfield,statefield; 
Choice paymentChoice; 
Button paymentButton,cancelButton; 
public void init() 
{ 
ButtonPanel = new Panel(); 
title=new Label("Purchase Form"); 
name=new Label("Name"); 
address=new Label("Address"); 
payment=new Label("payment"); 
phone=new Label("phone"); 
city=new Label("city"); 
state=new Label("state"); 
namefield=new TextField(25); 
addressfield=new TextField(30); 
cityfield=new TextField(20); 
statefield=new TextField(20); 
paymentChoice=new Choice(); 
paymentButton=new Button("purchase"); 
cancelButton=new Button("cancel"); 
GridBagLayout gbl=new GridBagLayout(); 
GridBagConstraints gbc=new GridBagConstraints(); 
setLayout(gbl); 
paymentChoice.add("visa"); 
paymentChoice.add("master card"); 
paymentChoice.add("cod"); 
title.setFont(new Font("Times-Roman",Font.BOLD+Font.ITALIC,16)); 
gbc.anchor=GridBagConstraints.NORTH; 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
add(title,gbc); 
gbc.fill=GridBagConstraints.HORIZONTAL; 
gbc.insets=new Insets(10,0,10,0); 
gbc.gridwidth = 1; 
add(name,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
add(namefield,gbc); 
gbc.insets=new Insets(0,0,10,0); 
gbc.gridwidth=1; 
add(address,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
add(addressfield,gbc); 
gbc.gridwidth=1; 
add(city,gbc); 
add(cityfield,gbc); 
add(state,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
add(statefield,gbc); 
gbc.fill = GridBagConstraints.NONE; 
gbc.gridwidth=1; 
add(payment,gbc); 
gbc.gridwidth = GridBagConstraints.REMAINDER; 
add(paymentChoice,gbc); 
ButtonPanel.add(paymentButton); 
ButtonPanel.add(cancelButton); 
gbc.anchor=GridBagConstraints.SOUTH; 
gbc.gridwidth = 4; 
add(ButtonPanel,gbc); 
} 
} 
