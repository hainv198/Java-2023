import BaiTap.HangSanXuat;
import BaiTap.MayBay;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(10, 39);
        ToaDo td2 = new ToaDo(10, 39);
        ToaDo td3 = new ToaDo(10, 39);
        ToaDo td4 = new ToaDo(10, 39);
        Hinh h = new Diem(td1);
        Hinh h2 = new HinhTron(td2, 10);
        Hinh h3 = new HinhChuNhat(td3, 10, 20);

        System.out.println(h);
        System.out.println(h2);
        System.out.println(h3);

        // Bai tap thuc hanh abstract

//        MayBay mb = new MayBay("May BAy", "sd","Xang");
        HangSanXuat h1 = new HangSanXuat("Hanv","Vi");
        h1.getTenHangSanXuat();


    }
}