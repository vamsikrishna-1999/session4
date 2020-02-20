package yearlyinterest;

public class App extends Thread
{
    public void run()
    {
        //System.out.print("hi");
        creategui a=new creategui();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}