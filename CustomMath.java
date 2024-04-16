public class CustomMath {
    //Declare static for you to call it without an object target
    // Data items
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
    /* Why is it safe to make these variables public?
     * It is safe to make these variables public because they are constants and cannot be changed.
     * How do you access these variables from another class?
     * You can access these variables from another class by using the class name followed by a dot and the variable name.
     */

    // Methods
    public static double max(double a, double b) {
        // Return the larger of the two integers
        return (a > b) ? a : b;
    }
    public double min(double a, double b) {
        // Return the smaller of the two doubles
        return (a < b) ? a : b;
    }
    public static int pow(int base, int exp) {
        // Return the base raised to the exponent
        return (int) Math.pow(base, exp);
    }
}
