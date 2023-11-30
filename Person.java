public class Person {
    private String name;
    private int age, Yeartoday, Birhtyear;

    public Person(String name, int age, int Yeartoday, int Birhtyear) {
        this.age = age;
        this.Birhtyear = Birhtyear;
        this.Yeartoday = Yeartoday;
        this.name = name;
    }

    public void Age() {
        age = Yeartoday - Birhtyear;
    }

    public String getName() {
        return name;
    }

    public int getage() {
        return age;
    }

    public int getYeartoday() {
        return Yeartoday;
    }

    public int getBirthyear() {
        return Birhtyear;
    }
}
