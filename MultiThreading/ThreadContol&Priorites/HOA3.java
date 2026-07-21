import java.util.*;
class maxthread extends Thread
{
    public void run()
    {
       for(int i=1;i<=5;i++)
       {
              System.out.println("MaxThread: "+i);
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
class minthread extends Thread
{
    public void run()
    {
       for(int i=1;i<=5;i++)
       {
              System.out.println("MinThread: "+i);
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
class normalthread extends Thread
{
    public void run()
    {
       for(int i=1;i<=5;i++)
       {
              System.out.println("NormalThread: "+i);
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
public class HOA3
{
    public static void main(String args[])
    {
        maxthread t1=new maxthread();
        minthread t2=new minthread();
        normalthread t3=new normalthread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}