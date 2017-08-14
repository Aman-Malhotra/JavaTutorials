import javax.swing.JOptionPane;
import javax.swing.JFrame;
class practice3
{
public static void main(String args[])
{
String N=JOptionPane.showInputDialog("Enter your name "); 
String A=JOptionPane.showInputDialog("Enter your age  "); 

practice2 aman= new practice2(N,A);
aman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
aman.setSize(400,100);
aman.setVisible(true);
}
}
