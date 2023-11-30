package Finals;

public class Mdas extends input {
    private int sum, diff, prod, quo;
    @Override
    public void compute()
    {
        sum = super.getInput1() + super.getInput2();
        diff = super.getInput1() - super.getInput2();
        prod = super.getInput1() * super.getInput2();
        quo = super.getInput1() / super.getInput2();
    }
    @Override
    public void display() 
    {
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quo);
    }
}
