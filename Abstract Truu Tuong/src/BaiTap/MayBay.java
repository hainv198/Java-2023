package BaiTap;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(String loaiPhuongTien, String loaiNhienLieu) {
        super(loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("Cat canh");
    }

    public void haCanh() {
        System.out.println("ha Canh");
    }

    @Override
    public double layVanToc() {
        return 0;
    }
}
