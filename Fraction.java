import java.util.Objects;

public class Fraction {
    // Data fields
    public final int numerator;
    public final int denominator;
    // We make this class immutable by making the fields final
    // Should be integers!!!!

    // Constructors
    // Constructor that takes the numerator and denominator as arguments
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // Copy constructor
    public Fraction(Fraction anotherFraction) {
        this.numerator = anotherFraction.numerator;
        this.denominator = anotherFraction.denominator;
    }
    // Methods


    @Override
    public String toString() {
        return "Fraction{" +
                + numerator +
                "/" + denominator +
                '}';
    }

    public Fraction add(Fraction that) {
        // Find common denominator
        int commonDenom = this.denominator * that.denominator;
        // Find new numerators
        int num1 = this.numerator * that.denominator;
        int num2 = that.numerator * this.denominator;
        // Add the numerators
        int num3 = num1 + num2;
        // Return the new fraction
        return new Fraction(num3, commonDenom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

}
