package FinalsActivity2;

public class Contractual extends Employee{
    @Override
    public void setGrossPay() {
        gross = 400 * super.getInput();
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
