import java.io.*;
public class Checked_Exception {
    public static void main(String[] args)throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("abc.text");
        pw.println("Hello");
        //unchecked exception line 7
//        System.out.println(10/0);
        System.out.println(8);
    }

}
