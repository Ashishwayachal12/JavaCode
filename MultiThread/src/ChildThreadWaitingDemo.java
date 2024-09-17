class MyThread3 extends Thread
{
    static Thread mt;

    public void run()
    {
        try
        {
           mt.join();
           //   mt.join(10000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        for (int i=0;i<10 ;i++ )
        {
            System.out.println("Child Thread");
        }

    }
}

class  ChildThreadWaitingDemo
{
    public static void main(String[] args)  throws InterruptedException
    {
        MyThread3.mt=Thread.currentThread();
        MyThread3 t=new MyThread3();
        t.start();
       // //	t.join();//(Dead Lock condition)
        for (int i=0;i<10 ;i++ )
        {
            System.out.println("MainThread");
            Thread.sleep(2000);
        }
    }
}
