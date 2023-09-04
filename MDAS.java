public class MDAS {
    private int num1, num2, sum, diff, pro, quo;
                
    public void setNum1(int value){
        num1 = value;
    }
    public  void setNum2 (int value){
        num2 = value;
    }
    
    public void Add(){
        sum = num1 + num2;
    }

    public void Subtract(){
        diff = num1 - num2;
    }

    public void Multiply(){
        pro = num1 * num2;
    }

    public void Divide(){
        quo = num1 / num2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }
    
    public int getSum(){
        return sum;
    }
    public int getDifference(){
        return diff;
    }
    public int getProduct(){
        return pro;
    }
    public int getQuotient(){
        return quo;
    }
}
