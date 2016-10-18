import java.awt.*; 
import java.awt.event.*; 
class TextFrame extends Frame implements ActionListener 
{ 
TextField txtName; 
TextField txtRollNo; 
TextArea areaDisplay; 
Label lblName,lblRollNo,lblDisplay; 
Button btnSubmit; 
TextFrame() 
{ 
txtName = new TextField(20); 
txtRollNo = new TextField(6); 
lblRollNo = new Label("Enter your Roll Number Here"); 
areaDisplay = new TextArea(5,25); 
lblName = new Label("Enter Your Name Here"); 
btnSubmit = new Button("Submit"); 
lblDisplay = new Label("You Have Entered The Following Details"); 


setLayout(new FlowLayout()); 
add(lblName); 
add(txtName); 
add(lblRollNo); 
add(txtRollNo); 
add(btnSubmit); 
add(lblDisplay); 
add(areaDisplay); 
btnSubmit.addActionListener(this); 
addWindowListener( new MyWindowAdapter(this)); 
} 
public void actionPerformed(ActionEvent e) 
{ 
areaDisplay.setText("Name: "+txtName.getText()+"\n Roll Number: "+txtRollNo.getText()); 
} 
public static void main(String[] a) 
{ 
TextFrame frame = new TextFrame(); 
frame.setSize(400,400); 
frame.setVisible(true); 
} 
} 
class MyWindowAdapter extends WindowAdapter 
{ 
TextFrame frame; 
MyWindowAdapter(TextFrame frame) 
{ 
this.frame=frame; 
} 
public void windowClosing(WindowEvent evt) 
{ 
frame.dispose(); 
System.exit(0); 
} 
} 
