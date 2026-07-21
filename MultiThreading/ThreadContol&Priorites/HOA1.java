import java.util.*;
class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread1: "+i);
            if(i==5)
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class HOA1
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        t1.start();
    }
}
