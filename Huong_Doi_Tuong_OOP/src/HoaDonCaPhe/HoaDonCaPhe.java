package HoaDonCaPhe;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaLoaiCaPhe;
    private double khoiLuong;

    public HoaDonCaPhe(String name, double price, double totalPrice) {
        this.tenLoaiCaPhe = name;
        this.giaLoaiCaPhe = price;
        this.khoiLuong = totalPrice;
    }

    public double tongGiaTien() {
        return  this.giaLoaiCaPhe * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongLonHon(double khoiLuong) {
//        if (this.khoiLuong > khoiLuong) {
//            return true;
//        }else  {
//            return  false;
//        }

        return this.khoiLuong > khoiLuong;
    }

    public boolean checkBill500k(double khoiLuong, double giaLoaiCaPhe) {
        if (this.khoiLuong * this.giaLoaiCaPhe >= 500) {
            return true;
        }else  {
            return false;
        }

    }

    public boolean checkTien500k() {
        return this.tongGiaTien() > 500000;
    }

    public double giamGia(double x) {
        if (this.tongGiaTien() > 500000) {
            return  (x/100)* this.tongGiaTien();
        }else  {
            return 0;
        }

    }

    public double giaSaukhiGiam(double x) {
        return  this.tongGiaTien() - this.giamGia(x);
    }
}
