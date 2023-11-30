package FinalsRecitation.Recitation21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("\n[1]MDAS of 2 numbers\n[2]Average of 3 numbers\nInput choice:");
            choice = sc.nextInt();
        } while(choice < 1 || choice > 2);
        if (choice == 1) {
            MDAS m = new MDAS();
            System.out.print("Input number:");
            m.setInput1(sc.nextDouble());
            System.out.print("Input number:");
            m.setInput2(sc.nextDouble());
            m.compute();
            m.display();
        }
        else{
            Average ave = new Average();
            System.out.print("Input number:");
            ave.setInput1(sc.nextDouble());
            System.out.print("Input number:");
            ave.setInput2(sc.nextDouble());
            System.out.print("Input number:");
            ave.setInput3(sc.nextDouble());
            ave.compute();
            ave.display();
        }
    }
}
