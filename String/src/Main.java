import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // equal so sanh chuoi tra ve true or phone

        String a = "hainv";
        String b = "    nguyen hihi haha   ";
        String c = "hainv";
        System.out.println((a.equals(b)));
        System.out.println((a.equals(c)));
        System.out.println((a.equalsIgnoreCase(c)));

        // length : kt do dai chuoi
        System.out.println(a.length());

        // up lower case hoa thuong
        System.out.println(a.toUpperCase());

        // trim : bỏ qua khoảng trắng đầu , cuối
        System.out.println(b.trim());

        // contains : kt xem chuỗi có chứa từ đó không -> result : true false
        System.out.println(b.contains("hihi"));

        // startWith(), endWith() -> kieemr tra bat dau hoặc kết thúc bằng kí tự gì

        // replace : thay thế kí tự này bằng 1 kí tự nào đó thường là dấu cách hoặc dấu chấm

        System.out.println(a.replace("hainv", "Hainv by dev"));

        // split() : tachs chuỗi ra thành 1 list
        List<String> words = Arrays.asList(b.split(" "));
        for (String word:words) {
            System.out.println(word);
        }

        // substring() cắt chuỗi
        System.out.println(b.substring(3, 7));

        // chatAt()
        System.out.println("ki tu lay ra trong chuoi la" + " " + b.charAt(5));
    }
}