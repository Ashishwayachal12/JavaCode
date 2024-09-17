//after throw statement we are not allowed to write any statement directly otherwise we will get get
//compiler time error saying un reachable statement

 class Throw_keyword_case_02 {
    public static void main(String[] args){
        System.out.println(10/0);
        System.out.println("Hello");
    }
}
//output:Exception in thread "main" java.lang.ArithmeticException: / by zero
// at Throw_keyword_case_02.main(Throw_keyword_case_02.java:6)

class Throw_keyword_2 {
    public static void main(String[] args){
       throw new ArithmeticException("/by zero");
// (do uncomment)       System.out.println("Hello");
    }
}
//output:error saying java: unreachable statement