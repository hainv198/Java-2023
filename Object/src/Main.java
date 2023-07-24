import Student.Student;
import Student.Depatment;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Khoi taoj phòng ban
         Depatment sk = new Depatment();
         sk.name = "Digital";
         sk.id = 3;


        Student s1 = new Student(1, "hainv","32 dong me");
        s1.id = 1;
        s1.name = "hainv";
        s1.address = "dong me";
        s1.position = sk;
        s1.birthday = LocalDate.of(1997, 11, 16);

        s1.printInformation();

        System.out.println(s1);

        System.out.println(s1.toString());
    }
}