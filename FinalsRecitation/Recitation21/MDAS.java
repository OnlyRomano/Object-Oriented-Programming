package FinalsRecitation.Recitation21;

public class MDAS implements Input{
    private double input1, input2, sum, diff, prod, quo;
    @Override
    public void setInput1(double value) {
        input1 = value;
    }

    @Override
    public void setInput2(double value) {
        input2 = value;
    }

    @Override
    public void compute(){
        sum = input1 + input2;
        diff = input1 - input2;
        prod = input1 * input2;
        quo = input1 / input2;
    }

    @Override
    public void display(){
        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + diff);
        System.out.println("Product:" + prod);
        System.out.println("Quotient:" + quo);
    }
}
