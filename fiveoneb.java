import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class fiveoneb extends JFrame
{
private JLabel item1;
public fiveoneb()
{
super ("The title Bar");//super is used to get the text on the title bar 
setLayout(new FlowLayout());//predefined layout method should be used as it is.
item1 = new JLabel("this is a sentence ");
item1.setToolTipText("this is gonna show up on hover");// to get something on hover 
add(item1);
}
}

