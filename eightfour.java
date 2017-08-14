import javax.swing.*;
public class eightfour
{
public static void main(String args[])
{
JFrame f = new JFrame("Title");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
eightfour2 aman = new eightfour2();
f.add(aman);
f.setSize(300,300);
f.setVisible(true);
}
}
