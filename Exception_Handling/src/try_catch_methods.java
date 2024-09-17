// Without using try-catch
class TryCatchMethods {
    public static void main(String[] args) {
        System.out.println("Statement-1");
        // ArithmeticException Exception
        System.out.println(10 / 0);
        System.out.println("Statement-3");

        // Output:
        // Statement-1
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at TryCatchMethods.main(TryCatchMethods.java:5)
    }
}

// With using try-catch
class TryCatchMethods1 {
    public static void main(String[] args) {
        System.out.println("Statement-1");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(10 / 2);
        }
        System.out.println("Statement-3");
    }
}

//output:Statement-1
//        5
//Statement-3
