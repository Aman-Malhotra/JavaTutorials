import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class sevenseven2 extends JFrame{
private String details;
private JLabel statusbar;
public sevenseven2()
{
super("Title");
statusbar=new JLabel ("This is default ");
add(statusbar,BorderLayout.SOUTH);
addMouseListener(new MouseClass());
}
private class MouseClass extends MouseAdapter
{
public void mouseClicked(MouseEvent event)
{
details=String.format("You clicked %d ",event.getClickCount());
if(event.isMetaDown())
details += "With right mouse button";
else if (event.isAltDown())
details+= "with center mouse button";
else
details +="With left mouse button";
statusbar.setText(details);
}
}
}




