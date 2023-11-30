package FinalsActivity;

public class Shape {
    private double side1, side2;
    protected double area, perimeter;
    public void setSide1(double value) {
        side1 = value;
    }
    public void setSide2(double value) {
        side2 = value;
    }
    public void setArea() {
        area = 0;
    }
    public void setPerimeter() {
        perimeter = 0;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
}
