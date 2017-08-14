import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class eightthree2 extends JFrame
{
private JButton lb;
private JButton cb;
private JButton rb;
private FlowLayout layout;
private Container container ;
public eightthree2()
{
super("Title");
layout = new FlowLayout();
container = getContentPane();
setLayout(layout);
lb = new JButton("Left");
add(lb);
lb.addActionListener(
new ActionListener()
{
public void actionPerformed (ActionEvent event)
{
layout.setAlignment(FlowLayout.LEFT);
layout.layoutContainer(container);
}
} );
cb = new JButton("Centre ");
add(cb);
cb.addActionListener(
new ActionListener()
{
public void actionPerformed (ActionEvent event)
{
layout.setAlignment(FlowLayout.CENTER);
layout.layoutContainer(container);
}
} );
rb = new JButton("Right ");
add(rb);
rb.addActionListener(
new ActionListener()
{
public void actionPerformed (ActionEvent event)
{
layout.setAlignment(FlowLayout.RIGHT);
layout.layoutContainer(container);
}
} 
);
}
}