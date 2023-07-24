package BaiTap;

public class XeDap extends PhuongTienDiChuyen{


    public XeDap(String loaiPhuongTien) {
        super(loaiPhuongTien);
    }

    public XeDap(HangSanXuat hangSanXuat) {
        super(hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 0;
    }
}
