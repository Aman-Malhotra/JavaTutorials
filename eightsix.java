import javax.swing.*;
import java.awt.*;

class eightsix
{
public static void main(String args[])
{
JFrame f = new JFrame("Title");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
eightsix2 aman = new eightsix2();
aman.setBackground(Color.WHITE);
f.add(aman);
f.setSize(500,270);
f.setVisible(true);
}
}


