
import javax.swing.*;
import java.awt.event.*;

class LoginS extends JFrame{
JLable l1,l2,l3,l4;
JTextField t1;
JPasswordField t2;
JButton b1,b2,b3;

LoginS(String s1){
super(s1);
}
LoginS(){

}
void setComponents(){
l1=new JLabel("Welcome to Vishal's First Application");
l2=new JLabel("Username");
l3=new JLabel("Password");
l4=new JLabel("");
t1=new JTextField();
t2=new JPasswordField();
b1=new JButton("Login");
b2=new JButton("Clear");
b3=new JButton("Add");
setLayout(null);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);

l1.setLayout(100,50,300,30);
l2.setLayout(100,200,100,30);
l3.setLayout(100,350,100,30);
l4.setLayout(100,350,200,30);
t1.setLayout(350,200,100,30);
t2.setLayout(350,350,100,30);
b1.setLayout(200,450,100,30);
b2.setLayout(400,450,100,30);
b3.setLayout(600,450,100,30);
}

public static void main(String args[]){
LoginS s1=new LoginS("Welcome to Vishal's Application");
s1.setVisible(true);
s1.setSize(700,700);
s1.setComponents();
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class log implements ActionListener{
public void actionPerfromed(ActionEvent e1){
String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("Vishal") && s2.equals("Birla")){
l4.setText("Login Successfull");
} else l4.setText("Login Successfull");
}
}

class Clear implements ActionListener{
public void actionPerformed(ActionEvent e1){
t1.setText("");
t2.setText("");
}
}

class Add implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
l4.setText("Addition is: "+a+b);
}
catch(Exception e2){
l4.settText("Please Enter a number only");
}
}
}
}

 
