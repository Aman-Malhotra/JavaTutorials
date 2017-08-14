import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class practice2 extends JFrame
{
private JLabel item1;
private JLabel item2;
private JLabel item3;
public  practice2(String name,String age)
{
super ("My own new window ");
setLayout(new FlowLayout());
item1 = new JLabel ("Future Welcomes You \n");
item2 = new JLabel (name+"\n");
item3= new JLabel(age);
item1.setToolTipText("FUTURE");
item2.setToolTipText("The developer");
item3.setToolTipText("Age of the developer ");
add (item1);
add (item2);
add (item3);
}
}

