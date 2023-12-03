package FinalsActivity2;

public class OnCommission extends Employee{
    @Override
    public void setGrossPay() {
        gross = 0.30 * super.getInput();
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
