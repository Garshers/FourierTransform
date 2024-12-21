public class Complex {
    private double real;
    private double imag;

    // Constructor of a complex number
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Method to multiply the current complex number by another one
    // Formula: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag; // Real part of the product
        double imagPart = this.real * other.imag + this.imag * other.real; // Imaginary part of the product
        return new Complex(realPart, imagPart);
    }

    // Method to get the magnitude from the complex number
    // Formula: sqrt(real^2 + imag^2)
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Method to get the phase of the complex number (radians)
    // Return the angle in radians of the polar coordinates given rectangular coordinates
    public double phase() {
        return Math.atan2(imag, real);
    }

    // Override the toString() method from the Object class
    // This method returns a custom string representation of the Complex object.
    // By default, the toString() method from the Object class would return a string like "Complex@15db9742".
    // We override this to return a human-readable format, e.g., "(real + imag i)".
    // The @Override annotation tells the compiler that we are overriding a method from the superclass (Object),
    // and it ensures that the method signature matches the one from the superclass. If the method doesn't exist in the superclass,
    // the compiler will produce an error, helping us avoid common mistakes.
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
}
