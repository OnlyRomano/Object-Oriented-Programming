import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MDAS m = new MDAS();
        try{
            System.out.print("Input Number: ");
            m.setNum1(sc.nextInt());
            System.out.print("Input Number: ");
            m.setNum2(sc.nextInt());

            m.Add();
            m.Subtract();
            m.Multiply();
            m.Divide();

            System.out.println("Sum: " + m.getSum());
            System.out.println("Difference: " + m.getDifference());
            System.out.println("Product: " + m.getProduct());
            System.out.println("Quotient: " + m.getQuotient());
        }
        catch(Exception error){
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
