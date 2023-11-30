public class Program6 {
    public static void main(String[] args) {
        Person Romano = new Person("Jhun Mark M. Romano", 20, 2023, 2002);

        Romano.Age();

        System.out.println("Name: " + Romano.getName());
        System.out.println("Birth Year: " + Romano.getBirthyear());
        System.out.println("Year Today: " + Romano.getYeartoday());
        System.out.println("Age: " + Romano.getage());
    }
}
