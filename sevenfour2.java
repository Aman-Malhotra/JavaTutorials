import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class sevenfour2 extends JFrame{
private JPanel mousepanel;
private JLabel statusbar;
public sevenfour2()
 { 
     super("The title");
     
     mousepanel= new JPanel();
     mousepanel.setBackground(Color.WHITE);
     add(mousepanel,BorderLayout.CENTER);
     
     statusbar = new JLabel ("Default");
     add(statusbar,BorderLayout.SOUTH);
     
     handlerclass handler = new handlerclass();
     mousepanel.addMouseListener(handler);
     mousepanel.addMouseMotionListener(handler);
}
private class handlerclass implements MouseListener,MouseMotionListener
{
    public void mouseClicked(MouseEvent event)
    {
     statusbar.setText(String.format("Clicked at %d ,%d",event.getX(),event.getY()));
    }
    public void mousePressed(MouseEvent event )
    {
        statusbar.setText("you pressed down the mouse ");
    }
    public void mouseReleased(MouseEvent event)
    {
    statusbar.setText("you released the button");
    }
    public void mouseEntered(MouseEvent event)
    {
        statusbar.setText("you eneterd the area");
        mousepanel.setBackground(Color.RED);
    }
    public void mouseExited(MouseEvent event)
    {
    statusbar.setText("The mouse has left the window");
    mousepanel.setBackground(Color.WHITE);
    }
    // these are mouse motion events 
    public void mouseDragged(MouseEvent event )
    {
        statusbar.setText("You are dragging the mouse ");
    }
    
    public void mouseMoved(MouseEvent event )
    {
        statusbar.setText("you are moving the mouse ");
    }
    
    
    
}
}

    
