package FinalsRecitation.Recitation21;

public class Average implements Input{
    private double input1, input2, input3, average;

    @Override
    public void setInput1(double value) {
        input1 = value;
    }

    @Override
    public void setInput2(double value) {
        input2 = value;
    }

    public void setInput3(double value){
        input3 = value;
    }

    public double getInput3(){
        return input3;
    }

    @Override
    public void compute(){
        average = (input1 + input2 + input3) / 3;
    }

    @Override
    public void display(){
        System.out.println("Average:" + average);
    }
}
