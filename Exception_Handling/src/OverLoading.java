class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("No-argument");
    }
    public  void run(int i)
    {
        System.out.println("int-argument");
    }
}
class OverLoading
{
    public static void main(String[] args)
    {
        MyThread1 t = new MyThread1();
        t.start();  //Thread can be start from no-argument only
        //t.run();

    }
}
