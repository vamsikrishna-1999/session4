package yearlyinterest;

import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class mediator implements ActionListener
{
    public static Button submitrec;
    static
    {
        creategui obj1=new creategui();
        submitrec=obj1.getsbutton();
    }
    private static mediator instance = new mediator();
    public static mediator getInstance()
    {
        return instance;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submitrec)
        {
            calculatecompoundinterest obj2=new calculatecompoundinterest();
            obj2.calculatecompoundinterest();
            calculatesimpleinterest obj1=new calculatesimpleinterest();
            obj1.calculatesimpleinterest();
        }
    }

}
