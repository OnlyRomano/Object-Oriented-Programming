import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();

        try{
            System.out.print("Input Rate: ");
            em.setrate(sc.nextDouble());
            System.out.print("Input Hours of Work: ");
            em.setHW(sc.nextDouble());

            em.GrossPay();
            em.Tax();
           
            em.Totaldeduction();
            em.Netpay();

            System.out.println("Gross Pay: " + String.format("%.2f",em.getGrossPay()));
            System.out.println("Tax: " + String.format("%.2f",em.getTax()));
            System.out.println("SSS: " + String.format("%.2f",em.getSSS()));
            System.out.println("PhilHealth: " + String.format("%.2f",em.getPhilhealth()));
            System.out.println("Pag Ibig: " + String.format("%.2f",em.getPagibig()));
            System.out.println("Total Deduction: " + String.format("%.2f",em.getTotaldeduction()));
            System.out.println("Net Pay: " + String.format("%.2f",em.getNetpay()));
            System.out.printf("Gross pay: %.2f", em.getGrossPay());

        }
        catch(Exception error){
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
