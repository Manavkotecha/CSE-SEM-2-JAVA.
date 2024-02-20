import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        Complex sum = c1.add(c2);

        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");

        scanner.close();
    }
}
