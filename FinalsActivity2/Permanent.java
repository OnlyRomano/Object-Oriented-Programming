package FinalsActivity2;

public class Permanent extends Employee{
    @Override
    public void setGrossPay() {
        gross = 500 * super.getInput();
    }

    @Override
    public void setTax(){
        tax = 0.12 * super.getGrossPay();
    }

    @Override
    public void setNetPay(){
        net = gross - tax;
    }
}
