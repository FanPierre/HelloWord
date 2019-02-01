package Thread;

public class newThread extends Thread
{
    private static volatile Boolean exit=true;

    public newThread(String name) {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(exit)
        {
            i++;
        }
    }

    public static void main(String args)throws Exception
    {
        Thread son_1=new newThread("thread-1");
       son_1.start();
       sleep(5000);
        exit=false;
    }
}
