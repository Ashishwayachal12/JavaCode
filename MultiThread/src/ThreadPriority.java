
class  MyThread extends Thread
{

}

class ThreadPriority
{
    public static void main(String[ ]args){

        System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(19);
        Thread.currentThread().setPriority(7);
        MyThread t=new MyThread();
        System.out.println(t.getPriority());

    }
}