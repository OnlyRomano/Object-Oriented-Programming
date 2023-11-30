package Finals;

public class Avarage extends input{
    private int num3, average;
    public void setInput3(int value)
    {
        num3 = value;
    }
    public int getInput3()
    {
        return num3;
    }
    @Override
    public void compute()
    {
        average = (super.getInput1() + super.getInput2() + num3) / 3;
    }
    @Override
    public void display()
    {
        System.out.println("Average: " + average);
    }
}
