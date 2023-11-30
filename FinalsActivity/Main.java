package FinalsActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.print("[1]Rectangle\n[2]Triangle\nInput choice:");
            choice = sc.nextInt();
        }while (choice < 1 || choice > 2);
        if(choice == 1){
            Rectangle rec = new Rectangle();
            System.out.print("Input Length:");
            rec.setSide1(sc.nextDouble());
            System.out.print("Input Width:");
            rec.setSide2(sc.nextDouble());
            rec.setArea();
            rec.setPerimeter();
            rec.getSide1();
            rec.getSide2();
            System.out.println("Area:" + rec.getArea());
            System.out.println("Perimeter:" + rec.getPerimeter());
        }
        else{
            Triangle tri = new Triangle();
            System.out.print("Input Side A:");
            tri.setSide1(sc.nextDouble());
            System.out.print("Input Side B:");
            tri.setSide2(sc.nextDouble());
            System.out.print("Input Side C:");
            tri.setSideC(sc.nextDouble());
            System.out.print("Input Height:");
            tri.setHeight(sc.nextDouble());
            tri.setArea();
            tri.setPerimeter();
            tri.getSide1();
            tri.getSide2();
            tri.getSideC();
            tri.getHeight();
            System.out.println("Area:" + tri.getArea());
            System.out.println("Perimeter:" + tri.getPerimeter());
        }
    }
}
