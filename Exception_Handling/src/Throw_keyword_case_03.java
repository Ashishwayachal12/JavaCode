//we can use throw keyword only for throwable types if we are trying to use for normally java object
//we will get compiler time error saying CE:incompatible type
//
 class Throw_keyword_case_03 {
    public static void main(String[]args){
       // throw new  Throw_keyword_case_03();
    }

}
//output :ava: incompatible types: Throw_keyword_case_03 cannot be converted to java.lang.Throwable
class Throw_keyword_03 extends RuntimeException {
    public static void main(String[]args){
         throw new  Throw_keyword_03();
    }

}
//output:Exception in thread "main" Throw_keyword_03
// at Throw_keyword_03.main(Throw_keyword_case_03.java:13)