import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class sixeight2 extends JFrame
{
    private JComboBox box;
    private JLabel picture;
    
    private static String[] filename= {"aman.png","honey.png"};
    private Icon[] pics = {new ImageIcon(getClass ().getResource(filename[0])),new ImageIcon(getClass ().getResource(filename[1]))};
        public sixeight2()
            {
                super("The title");
                setLayout(new FlowLayout());
                box = new JComboBox (filename);
                box.addItemListener(
                new ItemListener ()
                 {
                     public void itemStateChanged(ItemEvent event)
                     {
                       if (event.getStateChange()==ItemEvent.SELECTED)
                       picture.setIcon(pics[box.getSelectedIndex()]); 
                     }
                    }
                    );
                    add(box);
                    picture=new JLabel(pics[0]);
                    add(picture);    
                    
                
            }
    
}