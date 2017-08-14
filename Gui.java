import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
public class Gui extends JFrame 
{
   private JButton reg;
   private JButton custom;
   
   public Gui ()
   {
       super("The Title ");
       setLayout(new FlowLayout());
       reg = new JButton("Reg button");
       add(reg);
       
       Icon b = new ImageIcon(getClass().getResource("icon.gif"));
       Icon x = new ImageIcon(getClass().getResource("icon2.gif"));
       
       custom = new JButton("Custom",b);
       custom.setRolloverIcon(x);
       add (custom);
       
       HandlerClass  handler =new HandlerClass();
       reg.addActionListener (handler );
       custom.addActionListener(handler);
   }
   
   private class HandlerClass implements ActionListener  
   {
       public void actionPerformed(ActionEvent event)
       {
           JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
           
       }
   }
   
   
}