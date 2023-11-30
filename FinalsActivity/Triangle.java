package FinalsActivity;

public class Triangle extends Shape{
    private double height, SideC;

    public void setSideC(double value){
        SideC = value;
    }

    public void setHeight(double value){
        height = value;
    }

    public double getSideC(){
        return SideC;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public void setArea(){
        area = (super.getSide2() * height) / 2;
    }

    @Override
    public void setPerimeter(){
        perimeter = super.getSide1() + super.getSide2() + SideC;
    }
}
