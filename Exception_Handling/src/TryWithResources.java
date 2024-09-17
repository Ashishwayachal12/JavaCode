import java.io.*;
class TryWithResources
{
    public static void  main(String[ ]args)throws Exception
    {
        try(BufferedReader br=new BufferedReader(new FileReader("input.txt")))
        {
            //br=new BufferedReader(new FileReader("output.txt"));
        }
    }
}


// All resource reference variable are implicitly final and hences with in the try block we can't perform reassignment
//         otherwise we will get compiler time error

//error : auto-closeable resource br may not be assigned
//        br=new BufferedReader(new FileReader("output.txt"));