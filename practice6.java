import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
class practice6 extends JFrame
{
private JLabel statusBar;
private JPanel mousePanel;
public practice6()
{
super("Mouse Commands");
mousePanel = new JPanel();
mousePanel.setBackground(Color.BLUE);
add(mousePanel,BorderLayout.CENTER);

statusBar= new JLabel("Default");

add(statusBar,BorderLayout.SOUTH);

handlerclass aman = new handlerclass();

mousePanel.addMouseListener(aman);
mousePanel.addMouseMotionListener(aman);
}
private class handlerclass implements MouseListener,MouseMotionListener
{
public void mouseClicked(MouseEvent event)
{
statusBar.setText(String.format("You clicked at %s,%s",event.getX(),event.getY()));
}
public void mouseDragged(MouseEvent event)
{
statusBar.setText("You are dragging the mouse ");
}
public void mousePressed(MouseEvent event)
{
statusBar.setText("You just pressed");
}
public void mouseEntered(MouseEvent event)
{
statusBar.setText("You just entered the screen");
mousePanel.setBackground(Color.RED);
}
public void mouseExited(MouseEvent event)
{
statusBar.setText("You left the screen");
mousePanel.setBackground(Color.BLUE);
}
public void mouseReleased(MouseEvent event)
    {
    statusBar.setText("you released the button");
    }
public void mouseMoved(MouseEvent event)
    {
     statusBar.setText("you are moving the mouse");   
    }
}
}











