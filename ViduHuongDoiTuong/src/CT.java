public class CT {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham(2, "Coca", "Loai 2", "Anh 2");
        sp1.setMaSanPham(1);
        sp1.setTenSanPham("Banh Mi");
        sp1.setLoaiSanPham("Loai 1");
        sp1.setanhSanPham("Anh 1");
        
        String thongTinSP1 = sp1.toString();
        String thongTinSP2 = "SanPham{" +
                "maSanPham=" + sp2.getMaSanPham() +
                ", tenSanPham='" + sp2.getTenSanPham() + '\'' +
            '}';
        System.out.println(thongTinSP1);
        System.out.println(thongTinSP2);


        

    }
    
}
