 class ThrowKeywordExample {
    public static void main(String[] args) {
        // Implicit exception throwing by JVM
        // This line will cause the JVM to throw an ArithmeticException automatically
        System.out.println(10 / 0);
    }
}

// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at ThrowKeywordExample.main(ThrowKeywordExample.java:5)
// Note: In this case, the main method is responsible for causing the exception,
// and the JVM automatically creates the exception object and throws it.

 class ThrowKeywordExampleExplicit {
    public static void main(String[] args) {
        // Explicit exception throwing by the programmer
        // The programmer creates the ArithmeticException object manually and throws it
        throw new ArithmeticException("/ by zero");
    }
}
//output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at ThrowKeywordExample.main(ThrowKeywordExample.java:5)

// Note: In this case, the programmer is explicitly creating the exception object
// and manually handing it over to the JVM using the 'throw' keyword.
