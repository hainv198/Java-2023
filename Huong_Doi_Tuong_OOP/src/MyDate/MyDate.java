package MyDate;

public class MyDate {
    // thuoc tinh
    private  int day;
    private  int month;
    private  int year;

    // khoi tao contrustor
    public  MyDate( int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    // phuong thuc
    public void printDay () {
        System.out.println("Day" + this.day);
    }

    public void printMonth() {
        System.out.println("Month" + this.month);
    }

    public  void printYear() {
        System.out.println("Year" + this.year);
    }


}
