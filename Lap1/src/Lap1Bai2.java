public class Lap1Bai2 {
    public static void  main(String[] args) {
        java.util.Scanner bp = new java.util.Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double dai = bp.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rong = bp .nextDouble();
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        System.out.printf("Chu vi hình chữ nhật là: %f.2\n", chuVi);
        System.out.printf("Diện tích hình chữ nhật là: %f.2\n", dienTich);
    }
    
}
