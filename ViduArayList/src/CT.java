import java.util.ArrayList;

public class CT {
    public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham;
        dsSanPham = new ArrayList<SanPham>();
        SanPham sp1 = new SanPham(0, "Kem", "Giai khat", null);
        SanPham sp2 = new SanPham(1, "Nuoc", "Giai khat", null);
        SanPham sp3 = new SanPham(2, "Tra", "Giai khat", null);
        dsSanPham.add(sp1);
        dsSanPham.add(sp2);
        dsSanPham.add(sp3);
        for (SanPham sp : dsSanPham) 
            System.out.println(sp.toString());

        for(int i = 0; i < dsSanPham.size(); i++) {
            SanPham sp = dsSanPham.get(i);
            System.out.println(sp.toString());
        }
    }
}
