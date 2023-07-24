package Student;

import java.time.LocalDate;

public class Student {

    // đối tượng gômf phương thức và thuộc tính
    // khai báo thuộc tính : đặc điểm
    public int id;
    public String name;
    public String address;
    public LocalDate birthday;

    //Constructor
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // khai bao đối tượng này thuôcj phòng ban nào
    public Depatment position;


    // khai báo phương thức : hành động của đối tượng

    public void printInformation() {

   System.out.println("thong tin" + " " + address);
}
    @Override
    public String toString() {
        String result = "";
        result += "ID la : " + id;
        return result;
    }
}
