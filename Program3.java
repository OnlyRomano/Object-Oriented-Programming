public class Program3 {
    public static void main(String[] args) {
        SCT s = new SCT(65, 95.1, 60);

        s.Cosine();
        s.Sine();
        s.Tangent();

        System.out.println("Sine: " + String.format("%.2f", s.getSine()));
        System.out.println("Cosine: " + String.format("%.2f", s.getCosine()));
        System.out.println("Tangent: " + String.format("%.2f", s.gettangent()));
    }
}
