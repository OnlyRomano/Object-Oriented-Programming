package Finals;

import java.util.Scanner;

public class Program11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("[1]MDAS of 2 numbers");
            System.out.println("[2]Average of 23numbers");
            System.out.println("Input Choice: ");
            choice = sc.nextInt();
        } while(choice < 1 || choice > 2);
        
        if(choice == 1){
            Mdas m = new Mdas();
            System.out.print("Input number: ");
            m.setInput1(sc.nextInt());
            System.out.print("Input number: ");
            m.setInput2(sc.nextInt());
            m.compute();
            m.display();
        }
        else{
            Avarage a = new Avarage();
            System.out.print("Input number: ");
            a.setInput1(sc.nextInt());
            System.out.print("Input number: ");
            a.setInput2(sc.nextInt());
            System.out.print("Input number: ");
            a.setInput3(sc.nextInt());
            a.compute();
            a.display();
        }
        sc.close();
    }
    
}

