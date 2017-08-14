import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class sevenzero2 extends JFrame
{
private JList list;
private static String[] colornames={"black","blue","red","white"};
private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
public sevenzero2 ()
{
super("the title");
setLayout(new FlowLayout());
list = new JList (colornames);
list.setVisibleRowCount(4);
list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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




