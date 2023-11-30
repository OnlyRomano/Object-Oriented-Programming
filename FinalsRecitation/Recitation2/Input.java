package FinalsRecitation.Recitation2;

public abstract class Input {
    private double input1, input2;
    public void setInput1(double value) {
        input1 = value;
    }
    public void setInput2(double value) {
        input2 = value;
    }
    public double getInput1() {
        return input1;
    }
    public double getInput2() {
        return input2;
    }
    public abstract void compute();
    public abstract void display();
}
