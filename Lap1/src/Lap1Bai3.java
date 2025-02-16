public class Lap1Bai3 {
    public static void main(String[] args) {
        java.util.Scanner bp = new java.util.Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = bp.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.printf("Thể tích khối lập phương là: %.2f\n", theTich);
    }
}

