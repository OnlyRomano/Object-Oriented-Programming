import java.util.InputMismatchException;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int choice;

            do {
                System.out.println("1. MDAS of 2 Numbers");
                System.out.println("2. Avarage of 3 Numbers");
                System.out.println("Input Choice from 1 - 2: ");

                choice = sc.nextInt();
            } while (choice < 1 || choice > 3);

            if (choice == 1) {
                Mdas3 mdas = new Mdas3();
                System.out.print("Input Number: ");
                mdas.setdata1(sc.nextInt());
                System.out.print("Input Number: ");
                mdas.setdata2(sc.nextInt());

                mdas.Add();
                mdas.Subtract();
                mdas.Divide();
                mdas.Multiply();

                System.out.println("Sum: " + mdas.getSum());
                System.out.println("Difference: " + mdas.getDifferent());
                System.out.println("Product: " + mdas.getProduct());
                System.out.println("Quotient: " + mdas.getQuotient());
            }

            else {
                Average avg = new Average();
                System.out.print("Input Number: ");
                avg.setdata1(sc.nextInt());
                System.out.print("Input Number: ");
                avg.setdata2(sc.nextInt());
                System.out.print("Input Number: ");
                avg.setdata3(sc.nextInt());
                avg.setAverage();
                System.out.println("Avarage: " + avg.getAverage());
            }
        }

        catch (InputMismatchException error) {
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
