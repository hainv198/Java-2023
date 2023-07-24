import java.time.LocalDate;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        // random ra số ngẫu nhiên
        int x = random.nextInt();
        System.out.println(x);

        //random ra số trong khoảng chỉ định
        int y = random.nextInt(20);
        System.out.println(y);

        //random trong khoảng từ 5 -20 ;
        // logic là random số từ 0-5 rồi cộng tiếp với số =>  20 - 5 + 1
        int z = random.nextInt(6) + 15; // 100 -> 999

        System.out.println(z);



        // Random Day
        LocalDate minDate = LocalDate.of(1990,1,1);
        LocalDate maxDate = LocalDate.of(2023,1,1);

        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();

        int randomDay = random.nextInt(maxDay - minDay + 1) + minDay;

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println(randomDate);


    }
}