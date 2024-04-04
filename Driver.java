public class Driver {
    public static void main(String[] args) {
        Pair pair = new Pair("Hello", "World");

        // Accessing public methods works fine
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

        // Updating the key and value
        pair.setKey(1);
        pair.setValue(99);
        pair.displayPair(); // This method internally calls a private method

        // pair.printPair(); // This is not allowed and will cause a compilation error if uncommented
    }
}
