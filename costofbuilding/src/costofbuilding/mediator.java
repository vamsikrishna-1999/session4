package costofbuilding;
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mediator implements ActionListener 
{
	public static JRadioButton s1o1,s1o2,s1o3,s2o1,s2o2;
    public static TextField tf1,tf2;
    public static Button submit;
    static
    {
        creategui obj1=new creategui();
        s1o1=obj1.gets1o1();
        s1o2=obj1.gets1o2();
        s1o3=obj1.gets1o3();
        s2o1=obj1.gets2o1();
        s2o2=obj1.gets2o2();
        submit=obj1.getsubmit();
        tf1=obj1.getTextField1();
        tf2=obj1.getTextField2();
    }
    private static mediator instance = new mediator();
    public static mediator getInstance()
    {
        return instance;
    }
    public void actionPerformed(ActionEvent e)
    {
        int rate=0;
        int s2=0;
        int s3=0;
        if(e.getSource()==submit)
        {
            if(s1o1.isSelected())
                rate=1200;
            else if(s1o2.isSelected())
                rate=1500;
            else if(s1o3.isSelected())
                rate=1800;

            if(s2o1.isSelected() && rate!=1800)
                tf2.setText("Automation not available for this matierial\n");
            else if(s2o1.isSelected() && rate==1800)
                rate=rate+700;
            if(!((s2o1.isSelected() && rate!=1800)))
            {
            String s31=tf1.getText();
            try
            {
                s3=Integer.parseInt(s31);
                Double val=0.0;
                val=val+s3;
                val=val*rate;
                tf2.setText(Double.toString(val));
            }
            catch(NumberFormatException excep)
            {
                tf2.setText("pease enter valid number");
            }
            }

        }
    }


}
