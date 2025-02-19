import java.util.Scanner;
public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner bp = new java.util.Scanner(System.in);
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = bp.nextInt();
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.printf("Tiền điện: %d\n", tien);
    }
    
}
