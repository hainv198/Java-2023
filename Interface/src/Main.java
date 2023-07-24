import Cacugator.MayTinhCasioFx500;
import Cacugator.MayTinhVinaCal500;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MayTinhCasioFx500 mfx500 = new MayTinhCasioFx500();
        MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();

        mfx500.cong(10, 20);
        System.out.println(mfx500);
    }
}