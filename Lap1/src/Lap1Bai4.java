public class Lap1Bai4 {
    public static void main(String[] args) {
        java.util.Scanner bp = new java.util.Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = bp.nextDouble();
        System.out.print("Nhập b: ");
        double b = bp.nextDouble();
        System.out.print("Nhập c: ");
        double c = bp.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
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
