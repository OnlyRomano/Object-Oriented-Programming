import java.util.InputMismatchException;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mdas3 m = new Mdas3();

        try {
            System.out.print("Input a Number: ");
            m.setdata1(sc.nextInt());

            System.out.print("Input a Number: ");
            m.setdata2(sc.nextInt());

            m.Add();
            m.Subtract();
            m.Divide();
            m.Multiply();

            System.out.println("Sum: " + m.getSum());
            System.out.println("Difference: " + m.getDifferent());
            System.out.println("Product: " + m.getProduct());
            System.out.println("Quotient: " + m.getQuotient());
        }

        catch (InputMismatchException error) {
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
