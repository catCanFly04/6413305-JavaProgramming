import java.util.Scanner;
public class Lap1Bai1 {
    public static void main(String[] args) {
        Scanner bp = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = bp.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = bp.nextDouble();
        System.out.printf("%s %.2f điểm",  hoTen ,  diemTB);

    }
}

