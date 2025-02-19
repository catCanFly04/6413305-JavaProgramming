public class SanPham {
    int maSanPham;
    String tenSanPham;
    String loaiSanPham;
    String anhSanPham;
    //ham khoi tao
    public SanPham() {
    }
    public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, String anhSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.anhSanPham = anhSanPham;
    }
    //getter va setter
    public int getMaSanPham() {
        return maSanPham;
    }
    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }
    public String getTenSanPham() {
        return tenSanPham;
    }
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    public String getLoaiSanPham() {
        return loaiSanPham;
    }
    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
    public String getanhSanPham() {
        return anhSanPham;
    }
    public void setanhSanPham(String anhSanPham) {
        this.anhSanPham = anhSanPham;
    }
    @Override
    public  String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", loaiSanPham='" + loaiSanPham + '\'' +
                ", anhSanPham='" + anhSanPham + '\'' +
                '}';
    }


}
