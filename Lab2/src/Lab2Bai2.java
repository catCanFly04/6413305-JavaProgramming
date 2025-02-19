import java.util.Scanner;
public class Lab2Bai2 {
    public static void main(String[] args) {
        Scanner bp = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = bp.nextDouble();
        System.out.print("Nhập b: ");
        double b = bp.nextDouble();
        System.out.print("Nhập c: ");
        double c = bp.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.printf("Phương trình có nghiệm x = %.2f\n", x);
            }
        }
    }
    
}
