
/**
 * Write a description of class Point2D here.
 *
 * @ Vy Nguyen
 * @version (a version number or a date)
 */
public class Point2D
{
    // Declare 2 private instance variables
    private int x;
    private int y;
    /*
     * What effect does private have for methods trying to use x or y inside this class file?
     * Methods inside this class can access and modify x and y directly.
     *
     * What about methods trying to use x and y outside this class?
     * Methods outside this class cannot access x and y directly
     *
     * Can you use x and y without an associated object (or instance)?
     * no :<
     */

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
public Point2D() {
        // Default constructor
        this.x = 0;
        this.y = 0;
    }
    public void setX (int nX) {
        // Set private variable x equal to nx
        this.x = nX;
    }
    public void setY (int nY) {
        // Set y coord for this point
        this.y = nY;
    }
    public int getX() {
        // return copy of private integer X
        return this.x;
    }
    public int getY() {
        // return copy of private integer y
        return this.y;
    }
    public void resetToOrigin() {
        // set both x and y to 0
        this.x = 0;
        this.y = 0;
    }
    public void translate (int dx, int dy) {
        // Add dx to x and dy to y
        this.x += dx;
        this.y += dy;
    }
    public Point2D (Point2D other) { //Copy constructor
        this.x = other.x;
        this.y = other.y;
        // We dont have to use the getX or getY methods here bc its a direct field access?
    }
    @Override
    public String toString() {
        // Return a string representation of this point
        return "(" + this.x + "," + this.y + ")";
    }
    @Override
    public boolean equals(Object obj) {
        // check if the argument is an instance of Point2D (using the instanceof operator),
        // and then type cast the argument to Point2D.
        // Used IntellIJ for this
        if (this == obj) return true;
        if (!(obj instanceof Point2D)) return false;
        Point2D other = (Point2D) obj;
        return this.x == other.x && this.y == other.y;
    }
    // @Override not used here on purpose
    public boolean equals(Point2D that) {
        // I wasn't sure how to do this without doing “this == that” im sorry T-T
        if (this == that) return true;
        if (that == null) return false;
        return this.x == that.x && this.y == that.y;
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY());
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY());
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY());
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c);
        System.out.println("Are b and c equal:" + b.equals(c));
    }
}
