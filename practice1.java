import javax.swing.JOptionPane;
class practice1 
{
public static void main(String args[])
{
String n = JOptionPane.showInputDialog("Enter your name");
String fn = JOptionPane.showInputDialog("Enter your fathers name ");
String age = JOptionPane.showInputDialog("Enter your age here ");
int a = Integer.parseInt(age);
JOptionPane.showMessageDialog(null,"Your name = "+n+ "\nYour fathers name = "+fn+"\nYour age = "+a," Your details",JOptionPane.PLAIN_MESSAGE);

}

}
