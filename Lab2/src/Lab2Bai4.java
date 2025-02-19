public class Lab2Bai4 {
//     Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức
// năng để thoát khỏi ứng dụng.
    public static void main(String[] args) {
        java.util.Scanner bp = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("1. PTB1");
            System.out.println("2. PTB2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = bp.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhập a: ");
                    double a = bp.nextDouble();
                    System.out.print("Nhập b: ");
                    double b = bp.nextDouble();
                    if (a == 0) {
                        if (b == 0) {
                            System.out.println("Phương trình vô số nghiệm");
                        } else {
                            System.out.println("Phương trình vô nghiệm");
                        }
                    } else {
                        double x = -b / a;
                        System.out.printf("Phương trình có nghiệm x = %.2f\n", x);
                    }
                    break;
                case 2:
                    System.out.print("Nhập a: ");
                    double a2 = bp.nextDouble();
                    System.out.print("Nhập b: ");
                    double b2 = bp.nextDouble();
                    System.out.print("Nhập c: ");
                    double c2 = bp.nextDouble();
                    if (a2 == 0) {
                        if (b2 == 0) {
                            if (c2 == 0) {
                                System.out.println("Phương trình vô số nghiệm");
                            } else {
                                System.out.println("Phương trình vô nghiệm");
                            }
                        } else {
                            double x = -c2 / b2;
                            System.out.printf("Phương trình có nghiệm x = %.2f\n", x);
                        }
                    } else {
                        double delta = b2 * b2 - 4 * a2 * c2;
                        if (delta < 0) {
                            System.out.println("Phương trình vô nghiệm");
                        } else if (delta == 0) {
                            double x = -b2 / (2 * a2);
                            System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f\n", x);
                        } else {
                            double x1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
                            double x2 = (-b2 - Math.sqrt(delta)) / (2 * a2);
                            System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f và x2 = %.2f\n", x1, x2);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập số điện sử dụng: ");
                    int soDien = bp.nextInt();
                    int tien;
                    if (soDien <= 50) {
                        tien = soDien * 1000;
                    } else {
                        tien = 50 * 1000 + (soDien - 50) * 1200;
                    }
                    System.out.printf("Tiền điện: %d\n", tien);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
                    break;
                }
            }
        }
    }
    
    
