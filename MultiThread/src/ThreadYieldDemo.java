class MyThread1 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        }
        run1();
    }

    public void run1()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread-1");
            //Thread.yield();
        }
    }
}
class ThreadYieldDemo
{
    public static void main(String[] args)
    {
        MyThread1 t = new MyThread1();
        //t.setPriority(9);
        t.start();


        for(int i = 0; i < 10; i++)
        {
            System.out.println("Main Thread");
            //Thread.yield();
            //	try {
            //     Thread.sleep(10);  // Add a short sleep to allow child thread to execute
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}
