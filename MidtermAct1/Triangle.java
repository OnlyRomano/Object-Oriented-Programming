package MidtermAct1;

public class Triangle extends Shape{
    private double perimeter, area, sideC, height;

    public void setSideC(double value){
        sideC = value;
    }

    public void setHeight(double value){
        height = value;
    }

    public void Area(){
        area = (super.getData2() * height) / 2;
    }

    public void Perimeter(){
        perimeter = super.getData1() + super.getData2() + sideC;
    }

    public double getSideC(){
        return sideC;
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
