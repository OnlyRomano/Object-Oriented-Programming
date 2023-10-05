package Recitation2;

public class Triangle extends shape {
    private double perimeter, area, sideA, sideB;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        super(sideC, height);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void Area() {
        area = (sideB * super.getData2()) / 2;
    }

    public void Perimeter() {
        perimeter = sideA + sideB + super.getData1();
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
