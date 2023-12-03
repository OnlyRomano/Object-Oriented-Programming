package FinalsActivity2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("[1]Consultant\n[2]Contractual\n[3]On-commission\n[4]Permanent");
            System.out.print("Select your employment status:");
            choice = sc.nextInt();
        }while(choice < 1 || choice > 4);

        if (choice == 1) {
            Consultant con = new Consultant();
            con.setGrossPay();
            con.setTax();
            con.setNetPay();
            System.out.println("Gross Pay:" + con.getGrossPay());
            System.out.println("Tax:" + con.getTax());
            System.out.println("Net Pay:"  + con.getNetPay());
        }
        else if (choice == 2) {
            Contractual cont = new Contractual();
            System.out.print("Input your days worked:");
            cont.setInput(sc.nextDouble());
            cont.setGrossPay();
            cont.setTax();
            cont.setNetPay();
            System.out.println("Gross Pay:" + cont.getGrossPay());
            System.out.println("Tax:" + cont.getTax());
            System.out.println("Net Pay:"  + cont.getNetPay());
        }
        else if (choice == 3) {
            OnCommission On = new OnCommission();
            System.out.print("Input your total sales:");
            On.setInput(sc.nextDouble());
            On.setGrossPay();
            On.setTax();
            On.setNetPay();
            System.out.println("Gross Pay:" + On.getGrossPay());
            System.out.println("Tax:" + On.getTax());
            System.out.println("Net Pay:"  + On.getNetPay());
        }
        else {
            Permanent per = new Permanent();
            System.out.print("Input your days worked:");
            per.setInput(sc.nextDouble());
            per.setGrossPay();
            per.setTax();
            per.setNetPay();
            System.out.println("Gross Pay:" + per.getGrossPay());
            System.out.println("Tax:" + per.getTax());
            System.out.println("Net Pay:"  + per.getNetPay());
        }
    }
}
