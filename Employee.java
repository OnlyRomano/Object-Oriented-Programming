public class Employee {
    private double rate, HW, GP, tax, sss, PH, PI, TD, NP;

    public void setrate(double value){
        rate  = value;
    }

    public void setHW(double value){
        HW = value;
    }

    public void GrossPay(){
        GP = rate * HW;
    }

    public void Tax(){
        tax = .12 * GP;
    }

    public void SSS(){
        sss = .10 * GP;
    }

    public void Philhealth(){
        PH = .08 *  GP;
    }

    public void Pagibig(){
        PI = .06 * GP;
    }

    public void Totaldeduction(){
        TD = tax + sss + PH + PI;
    }

    public void Netpay(){
        NP = GP - TD;
    }

    public double getrate(){
        return rate;
    }

    public double getHour_swork(){
        return HW;
    }

    public double getGrossPay(){
        return GP;
    }

    public double getTax(){
        return tax; 
    }

    public double getSSS(){
        return sss;
    }

    public double getPhilhealth(){
        return PH;
    }

    public double getPagibig(){
        return PI;
    }

    public double getTotaldeduction(){
        return TD;
    }

    public double getNetpay(){
        return NP;
    }

}
