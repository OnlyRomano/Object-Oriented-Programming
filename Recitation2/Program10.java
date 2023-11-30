package Recitation2;

public class Program10 {
    public static void main(String[] args) {
        Trigonometric trig = new Trigonometric(20, 15, 30, 18);

        trig.Cosine();
        trig.Sine();
        trig.Tangent();

        System.out.println("-------------------Trigonometric--------------------");
        System.out.println("SideA: " + trig.getSideA());
        System.out.println("SideB: " + trig.getSideB());
        System.out.println("SideC: " + trig.getData1());
        System.out.println("Height: " + trig.getData2());
        System.out.println("Sine: " + String.format("%.2f", trig.getSine()));
        System.out.println("Cosine: " + String.format("%.2f", trig.getCosine()));
        System.out.println("Tangent: " + String.format("%.2f", trig.getTangent()));
    }
}
