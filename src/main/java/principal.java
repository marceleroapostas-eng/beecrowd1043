
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {

            double perimetro = A + B + C;

            System.out.printf("Perimetro = %.1f%n", perimetro);

        } else {

            double area = ((A + B) * C) / 2;

            System.out.printf("Area = %.1f%n", area);
        }

    }
}
