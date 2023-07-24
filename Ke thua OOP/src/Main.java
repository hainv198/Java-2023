import Animal.BabyDog;
import Animal.Dog;
import ConNguoi.ConNguoi;
import ConNguoi.hocSinh;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConNguoi vn = new ConNguoi("hainv",2023);
        vn.an();
        hocSinh hs = new hocSinh("hainv", 2023, "FPT", "Lop 1");

        hs.an();


        // Dạng kế thưa OOP

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        BabyDog bb = new BabyDog();
        bb.color();
        bb.bark();
        bb.eat();
    }
}