import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap ho ten : ");
//        String name = scanner.nextLine();
//        System.out.println("xin chao " + name + "Nhap so thu 1");
//
//        int num1 = scanner.nextInt();
//        System.out.println("Nhap so thu 2");
//        int num2 = scanner.nextInt();
//
//        System.out.println(num1 + num2);

        //ex 3 : Tính sôs tuổi của user khi họ nhập vào

        System.out.println("Nhap nam sinh cua ban theo (dd/MM/yyyy) : ");
        String birthday = scanner.nextLine();

        String pattern = "dd-MM-yyyy";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(pattern);
        LocalDate date  = LocalDate.parse(birthday, dateFormat);

        int age = LocalDate.now().getYear() - date.getYear();

        System.out.println("Tuoi ban la" + age);
    }
}