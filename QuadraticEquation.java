
import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double d = (b * b) - (4 * a * c);

        System.out.println("Discriminant = " + d);

        // Find nature of roots
        if (d > 0) {

            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Nature of roots: Two distinct real roots");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (d == 0) {

            double root = -b / (2 * a);

            System.out.println("Nature of roots: Two equal real roots");
            System.out.println("Root 1 = " + root);
            System.out.println("Root 2 = " + root);

        } else {

            System.out.println("Nature of roots: Complex/imaginary roots");
        }

        sc.close();
    }
}
