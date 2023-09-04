public class Program4 {
    public static void main(String[] args) {
        Mdas2 m = new Mdas2(20, 15);

        m.Add();
        m.Subtract();
        m.Multiply();
        m.Divide();

        System.out.println("Sum: " + m.getSum());
        System.out.println("Difference: " + m.getDifference());
        System.out.println("Product: " + m.getProduct());
        System.out.println("Quotient: " + m.getQuotient());
    }
}
