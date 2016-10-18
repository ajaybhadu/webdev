/** <applet code=ListApplet width = 600 height = 400> 
</applet>*/ 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class ListApplet extends Applet implements ActionListener{ 
List fruits; 
List drinks; 
Panel fruitpanel; 
Panel drinkpanel; 
Label fruitlabel; 
Label drinklabel; 
String msg,fruit; 
public void init(){ 
fruits = new List(4,false); 
fruits.addActionListener(this); 
fruits.add("Apple"); 
fruits.add("Graphes"); 
fruits.add("Mango"); 
fruits.add("Banana"); 
fruits.add("Orange"); 
fruits.select(3); 
fruitlabel = new Label("Select Your Favourite Fruit"); 
fruitpanel = new Panel(); 
fruitpanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
fruitpanel.add(fruitlabel); 
fruitpanel.add(fruits); 
drinks = new List(6,true); 
drinks.addActionListener(this); 
drinks.add("Pepsi"); 
drinks.add("Coke"); 
drinks.add("Sprite"); 
drinks.add("Maza"); 
drinks.add("Fruity"); 
drinks.add("7up"); 
drinks.add("Mirinda"); 
drinks.add("Fanta"); 
drinklabel = new Label("Select as Many drinks as you want"); 
drinkpanel = new Panel(); 
drinkpanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
drinkpanel.add(drinklabel); 
drinkpanel.add(drinks); 
setLayout(new GridLayout(3,1)); 
add(fruitpanel); 
add(drinkpanel); 
} 
public void actionPerformed(ActionEvent ae){ 
msg = ""; 
int[] drinkarr = drinks.getSelectedIndexes(); 
for(int i = 0;i<drinkarr.length;i++) 
msg+=drinks.getItem(drinkarr[i])+","; 
msg+="."; 
repaint(); 
} 
public void paint(Graphics g){ 
String fruit = fruits.getSelectedItem(); 
g.drawString("The Fruit you like most is : " + fruit,10,350); 
g.drawString("Your Favourite drinsk are : " + msg,10,300); 
} } 

