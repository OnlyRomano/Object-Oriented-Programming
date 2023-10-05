package Recitation2;

public class Trigonometric extends Triangle {
    private double sine, cosine, tangent, Height;

    public Trigonometric(double sideA, double sideB, double sideC, double height) {
        super(sideA, sideB, sideC, height);
    }

    public void Sine() {
        sine = super.getSideB() / super.getData1();
    }

    public void Cosine() {
        cosine = super.getSideA() / super.getData1();
    }

    public void Tangent() {
        tangent = super.getSideB() / super.getSideA();
    }

    public double getHeight() {
        return Height;
    }

    public double getSine() {
        return sine;
    }

    public double getCosine() {
        return cosine;
    }

    public double getTangent() {
        return tangent;
    }

}
