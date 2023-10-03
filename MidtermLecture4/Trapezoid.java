package MidtermLecture4;

public class Trapezoid extends Shape{
    private double perimeter, area, sideA, sideB, sideD;

    public Trapezoid(double sideA, double sideB, double sideC, double sideD, double height) {
        super(sideC, height);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideD = sideD;
    }

    public void Area() {
        area = ((sideA + sideB) / 2) * super.getData2();
    }

    public void Perimeter() {
        perimeter = sideA + sideB + super.getData1() + sideD;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideD() {
        return sideD;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
