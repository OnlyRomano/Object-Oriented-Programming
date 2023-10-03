package MidtermLecture4;

public class Program9 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(20, 25, 30, 23);
        Trapezoid tra = new Trapezoid(25, 26, 30, 27, 28);

        tri.Area();
        tri.Perimeter();
        tra.Area();
        tra.Perimeter();

        System.out.println("-------------------TRIANGLE--------------------");
        System.out.println("SideA: " + tri.getSideA());
        System.out.println("SideB: " + tri.getSideB());
        System.out.println("SideC: " + tri.getData1());
        System.out.println("Height: " + tri.getData2());
        System.out.println("Area: " + tri.getArea());
        System.out.println("Perimeter: " + tri.getPerimeter());

        System.out.println("-------------------TRAPEZOID--------------------");
        System.out.println("SideA: " + tra.getSideA());
        System.out.println("SideB: " + tra.getSideB());
        System.out.println("SideC: " + tra.getData1());
        System.out.println("SideD: " + tra.getSideD());
        System.out.println("Height: " + tra.getData2());
        System.out.println("Area: " + tra.getArea());
        System.out.println("Perimeter: " + tra.getPerimeter());
    }
}
