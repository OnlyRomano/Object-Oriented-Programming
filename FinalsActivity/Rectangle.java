package FinalsActivity;

public class Rectangle extends Shape{
    @Override
    public void setArea(){
        area = super.getSide1() * super.getSide2();
    }

    @Override
    public void setPerimeter(){
        perimeter = (super.getSide1() + super.getSide2()) * 2;
    }
}
