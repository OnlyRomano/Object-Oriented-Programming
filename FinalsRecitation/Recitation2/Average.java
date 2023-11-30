package FinalsRecitation.Recitation2;

public class Average extends Input{
    private double input3, average;

    public void setInput3(double value){
        input3 = value;
    }

    public double getInput3(){
        return input3;
    }

    @Override
    public void compute(){
        average = (super.getInput1() + super.getInput2() + input3) / 3;
    }

    @Override
    public void display(){
        System.out.println("Average:" + average);
    }
}
