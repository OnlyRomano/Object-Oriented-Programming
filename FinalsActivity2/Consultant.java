package FinalsActivity2;

public class Consultant extends Employee{
    @Override
    public void setGrossPay() {
        gross = 100000;
    }

    @Override
    public void setTax(){
        tax = 0;
    }

    @Override
    public void setNetPay(){
        net = gross - tax;
    }
}
