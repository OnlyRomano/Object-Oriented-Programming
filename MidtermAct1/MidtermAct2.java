package MidtermAct1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MidtermAct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int choice;

            do {
                System.out.println("1. compute the area and perimeter of the triangle");
                System.out.println("2. compute the area and perimeter of the trapezoid");
                System.out.println("Input Choice from 1 - 2: ");

                choice = sc.nextInt();
            } while (choice < 1 || choice > 3);

            Triangle tri = new Triangle();
            Trapezoid trap = new Trapezoid();

            if (choice == 1) {
                System.out.print("Input SideA: ");
                tri.setData1(sc.nextDouble());
                System.out.print("Input SideB: ");
                tri.setData2(sc.nextDouble());
                System.out.print("Input SideC: ");
                tri.setSideC(sc.nextDouble());
                System.out.print("Input Height: ");
                tri.setHeight(sc.nextDouble());

                tri.Area();
                tri.Perimeter();

                System.out.println("Area: " + tri.getArea());
                System.out.println("Perimeter: " + tri.getPerimeter());
            }

            else {
                System.out.print("Input SideA: ");
                trap.setData1(sc.nextDouble());
                System.out.print("Input SideB: ");
                trap.setData2(sc.nextDouble());
                System.out.print("Input SideC: ");
                trap.setSideC(sc.nextDouble());
                System.out.print("Input SideD: ");
                trap.setSideD(sc.nextDouble());
                System.out.print("Input Height: ");
                trap.setHeight(sc.nextDouble());

                trap.Area();
                trap.Perimeter();

                System.out.println("Area: " + trap.getArea());
                System.out.println("Perimeter: " + trap.getPerimeter());
            }
        }

        catch (InputMismatchException error) {
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}