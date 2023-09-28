package MidtermAct1;

public class Trapezoid extends Shape{
    private double perimeter, area, sideC, sideD, height;
    
    public void setSideC(double value){
        sideC = value;
    }

    public void setSideD (double value) {
        sideD = value;
    }

    public void setHeight (double value) {
        height = value;
    }

    public void Area(){
        area = ((super.getData1()+ super.getData2()) / 2) * height;
    }

    public void Perimeter(){
        perimeter = super.getData1() + super.getData2() + sideC + sideD;
    }

    public double getSideC(){
        return sideC;
    }

    public double getSideD(){
        return sideD;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
}
