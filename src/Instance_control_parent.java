//---------------Parent Instance Block-------------------//
class  Instance_control_parent
{
    int i=10;
    {
        m1();
        System.out.println("Parent Instance Block");
    }
    Instance_control_parent()
    {
        System.out.println("Parent constuctor");
    }
    public static void main(String[ ]args)
    {
        Instance_control_parent  icp=new Instance_control_parent();
        System.out.println("Parent main");
    }
    public void m1()
    {
        System.out.println(j);
    }
    int j=20;
}
//---------------Child Instance Block----------------//

class Instance_control_child extends Instance_control_parent
{
    int x=100;
    {
        m2();
        System.out.println("child first instance block");
    }
    Instance_control_child()
    {
        System.out.println("Child Constuctor");
    }
    public static void  main(String[ ]args)
    {
        Instance_control_child icc=new Instance_control_child();

        System.out.println("Child main");
    }
    public void m2()
    {
        System.out.println(y);
    }
    {
        System.out.println("Child Second instance block");
    }
    int y=200;


}