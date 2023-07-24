package BaiTap;

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOto(String loaiPhuongTien) {
        super(loaiPhuongTien);
    }

    public XeOto(HangSanXuat hangSanXuat) {
        super(hangSanXuat);
    }


    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 0;
    }
}
