public class SquareSomething {
    // Method to square an int value
    public static int square(int number) {
        return number * number;
    }

    // Method to square a double value
    public static double square(double number) {
        return number * number;
    }

    // Method to square a float value
    public static float square(float number) {
        return number * number;
    }

    // Main method to demonstrate the usage of the square methods
    public static void main(String[] args) {
        int resultInt = SquareSomething.square(5); // Should return 25 :3
        double resultDouble = SquareSomething.square(5.5); // Should return 30.25 :3
        float resultFloat = SquareSomething.square(5.5f); // Should return 30.25 :3

        // Print statements for testing
        System.out.println("Square of int: " + resultInt);
        System.out.println("Square of double: " + resultDouble);
        System.out.println("Square of float: " + resultFloat);
    }
}
