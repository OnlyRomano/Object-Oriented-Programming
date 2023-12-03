package FinalsActivity2;

public abstract class Employee {
    private double input;
    protected double gross, tax, net;

    public void setInput(double value){
        input = value;
    }

    public abstract void setGrossPay();
    public abstract void setTax();
    public abstract void setNetPay();

    public double getInput(){
        return input;
    }

    public double getGrossPay(){
        return gross;
    }

    public double getTax(){
        return tax;
    }

    public double getNetPay(){
        return net;
    }
}
