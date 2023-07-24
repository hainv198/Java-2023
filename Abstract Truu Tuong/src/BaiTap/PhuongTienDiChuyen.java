package BaiTap;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public PhuongTienDiChuyen(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void batDau() {
        System.out.println("Bat Dau");
    }
    public void tangToc() {
        System.out.println("Tang toc");
    }
    public void dungLai() {
        System.out.println("Dung lai");
    }


    public abstract double layVanToc();


}
