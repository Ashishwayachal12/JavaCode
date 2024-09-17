class Overloading {
    public static void main(String[] args) {
        Overloading O = new Overloading();
        O.m1();           // Calls the no-argument version of m1()
        O.m1(10);         // Calls the int argument version of m1()
        O.m1(10.5);       // Calls the double argument version of m1()
    }

    // No-argument method
    public void m1() {
        System.out.println("No-args");
    }

    // Method with an int argument
    public void m1(int i) {
        System.out.println("int-args");
    }

    // Method with a double argument
    public void m1(double d) {
        System.out.println("Double-args");
    }
}
