import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sixfour2 extends JFrame
{
private JTextField tf;
private JCheckBox boldBox;
private JCheckBox italicBox;
public sixfour2 ()
{
super ("The title");
setLayout(new FlowLayout());
 tf = new JTextField("This is a sentence ",20);
 tf.setFont(new Font("Serif",Font.PLAIN,14));
 add(tf);
 boldBox = new JCheckBox("bold");
 italicBox = new JCheckBox("italic");
 add(boldBox);
 add(italicBox);
 handler hand = new handler ();
 boldBox.addItemListener(hand);
 italicBox.addItemListener(hand);
}
private class  handler implements ItemListener
{
public void itemStateChanged(ItemEvent event)
{
Font font =null;
if(boldBox.isSelected()&&italicBox.isSelected())
font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
else if (boldBox.isSelected())
font = new Font ("Serif",Font.BOLD,14);
else if (italicBox.isSelected())
font = new Font ("Serif",Font.ITALIC,14);
else 
font = new Font ("Serif",Font.PLAIN,14);
tf.setFont(font);
}
}
}
