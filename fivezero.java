//Graphical user intrface

import javax.swing.JOptionPane;
class fivezero
{
public static void main(String args[])
{
String fn = JOptionPane.showInputDialog("Enter you first number ");
String sn = JOptionPane.showInputDialog("Enter you second number ");

int num1=Integer.parseInt(fn);
int num2=Integer.parseInt(sn);
int  Sum= num1+num2;

JOptionPane.showMessageDialog(null,"The Sum is "+Sum,"Addition",JOptionPane.PLAIN_MESSAGE);
}
}
