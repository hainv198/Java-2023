import HoaDonCaPhe.HoaDonCaPhe;
import MyDate.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate hainv = new MyDate(10,3, 2023);
        hainv.printDay();

        HoaDonCaPhe hd = new HoaDonCaPhe("trung nguyen", 10400000, 2.4);

        System.out.println(hd.tongGiaTien());

        System.out.println("check > " + hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("check gia " + hd.checkBill500k(1.5,400));

        System.out.println("check tong tien" + " "  + hd.checkTien500k());

        System.out.println("hoa don giam gia" + " " + hd.giamGia(20));

        System.out.println("Gia tien sau khi giam gia" + " " + hd.giaSaukhiGiam(20));
    }
}