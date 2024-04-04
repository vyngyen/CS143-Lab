public class Pair {
    private Object key;
    private Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    // Public getter for key
    public Object getKey() {
        return key;
    }

    // Public getter for value
    public Object getValue() {
        return value;
    }

    // Public setter for key
    public void setKey(Object key) {
        this.key = key;
    }

    // Public setter for value
    public void setValue(Object value) {
        this.value = value;
    }

    // Example of a private method
    private void printPair() {
        System.out.println("Key: " + key + ", Value: " + value);
    }

    // Public method to demonstrate accessing a private method
    public void displayPair() {
        printPair(); // This will work because it's called within the class
    }
}

