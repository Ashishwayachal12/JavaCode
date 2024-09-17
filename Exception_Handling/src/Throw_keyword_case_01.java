//throw e if  e refers Null these we will get NullPointer exception
 class Throw_keyword_case_01 {
    static ArithmeticException e=new ArithmeticException();
    public static void main(String[] args){
        throw e;
    }
}
//output:RE:ArithmeticException
class Throw_keyword_02 {
    static ArithmeticException e;
    public static void main(String[] args){
        throw e;
    }
}
//output:Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "Throw_keyword_case_02.e" is null
// at Throw_keyword_case_02.main(Throw_keyword_case_01.java:12)