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
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f và x2 = %.2f\n", x1, x2);
            }
        }
    }
    
}
