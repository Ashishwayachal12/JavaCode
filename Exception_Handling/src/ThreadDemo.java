class MyThread extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        //t.start();//Separate Thread will be created (jvm can handle Thread Scheduler)
         t.run();  //Single Thread can run
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Main Thread");
        }
    }
}
