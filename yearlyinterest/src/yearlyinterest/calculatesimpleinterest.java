package yearlyinterest;
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class calculatesimpleinterest 
{
	public static void calculatesimpleinterest()
    {
        creategui obj1=new creategui();
        TextField tf1=obj1.getTextField1();
        TextField tf2=obj1.getTextField2();
        TextField tf3=obj1.getTextField3();
        TextField tf4=obj1.getTextField4();
        TextField tf5=obj1.getTextField5();
        String s1=tf1.getText();
        String s2=tf2.getText();
        String s3=tf3.getText();
        //System.out.print(s1+" "+s2+" "+s3);
        try
        {
            Double p=Double.parseDouble(s1);
            Double t=Double.parseDouble(s2);
            Double r=Double.parseDouble(s3);
            Double ci=(p*t*r)/100;
            tf4.setText(Double.toString(ci));
        }
        catch(NumberFormatException e)
        {
            tf4.setText("please fill correst information");
        }
        //tf4.setText("simple interest");
    }

}
