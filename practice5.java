import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class practice5 extends JFrame
{
private JList list;
private static  String[]  colornames={"Black","White","Red","Yellow"};
private static Color[] colors= {Color.BLACK,Color.WHITE,Color.RED,Color.YELLOW};

public practice5()
{
super("The Title");
setLayout (new FlowLayout());
list = new JList(colornames);
list.setVisibleRowCount(4);
add(new JScrollPane(list));
list.addListSelectionListener(
new ListSelectionListener()
{
public void valueChanged(ListSelectionEvent event)
{
getContentPane().setBackground(colors[list.getSelectedIndex()]);
}
}
);
}
}





