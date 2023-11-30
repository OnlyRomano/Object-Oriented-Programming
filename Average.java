public class Average extends input{
    private int data3, avg;

    public void setdata3(int value) {
        data3 = value;
    }

    public void setAverage() {
        avg = (super.getdata1() + super.getdata2()+ data3) / 3;
    }

    public int getdata3() {
        return data3;
    }

    public int getAverage() {
        return avg;
    }
}
