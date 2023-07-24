// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(10,5,2023);
        Ngay ngay3 = new Ngay(5, 8, 1998);

        TacGia tacGia1 = new TacGia ("Hainv", ngay1);

        TacGia tacGia2 = new TacGia("Linh Chi", ngay3);

        Sach sach1 = new Sach("Tu hoc lap trinh", 5000, 2023, tacGia1);
        Sach sach2 = new Sach("Tu hoc lap trinh", 5000, 2023, tacGia2);

        sach1.tenQuyenSach();

        System.out.println(sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println(sach1.giaSachSauKhiGiam(10));
    }
}