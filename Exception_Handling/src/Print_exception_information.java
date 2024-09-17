 class Print_exception_information {
    public static void main(String[]args){
        try{
            System.out.println(10/0);

        }
        catch (ArithmeticException e){
//         1. e.printStackTrace();
//         output:   java.lang.ArithmeticException: / by zero
//            at Print_exception_information.main(Print_exception_information.java:4)



//          2. System.out.println(e);
//          output:  java.lang.ArithmeticException: / by zero

//
//           3. System.out.println(e.toString());
//        output:    java.lang.ArithmeticException: / by zero

//          4.  System.out.println(e.getMessage());
//           output: / by zero
        }
    }

}
//Note:Internally default exception handle will use print stacktrace methode to
// print exception information to the console
