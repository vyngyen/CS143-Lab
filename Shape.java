import java.awt.Color;
import java.awt.Graphics;

public class Shape {
    /* Contain data items common to all shapes
     * An x,y, or a color all shapes have these elements
     * Constraints: x and y are integers, x and y are positive, color is a valid color, color is not null
     */

    // Declare and x and y
    private int x;
    private int y;

    // Declare a color object
    private Color color;

    // Create constructor with no parameters
    public Shape() {
        x = 0;
        y = 0;
        color = Color.BLACK;
    }

    // Create constructor with parameters for x and y and color
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Create constructor with parameters for a shape object that will create a new exact copy
    public Shape(Shape anotherShape) {
        this.x = anotherShape.x;
        this.y = anotherShape.y;
        this.color = anotherShape.color;
    }

    // Instance methods
    // Getters and setters for x and y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override // I used ChatGPT to help me with formatting this since I was unsure how
    public String toString() {
        // Formatting the color to show RGB values
        String colorDescription = (color == null) ? "null" : String.format("java.awt.Color[r=%d,g=%d,b=%d]", color.getRed(), color.getGreen(), color.getBlue());

        // Returning the formatted string
        return String.format("Shape (%d,%d) and color:%s and area: %.1f", x, y, colorDescription, getArea());
    }

    public double getArea() {
        return -1;
    }

    public void draw(Graphics g) {

    }
}

