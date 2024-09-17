class MyThread2 extends Thread
{
    public void run()
    {
        for (int i=0;i<10 ;i++ )
        {

            System.out.println("Child Thread");
            try
            {

                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
              e.printStackTrace();

            }
        }

    }
}

class  ThreadJoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {

        MyThread2 t=new MyThread2();
        t.start();
        //	t.join();
        t.join(10000);  //long ms
        //t.join(10000,100);//long ms and int ns
        for (int i=0;i<10 ;i++ )
        {
            System.out.println("Main Thread");
        }

    }
}
