import java.util.Scanner;
public class GiaiphuongTrinhBacHai {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh giai phuong trinh bac 2 ax^2 + bx + c = 0");
        System.out.print("Nhap gia tri a (khac 0) , b , c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Tinh delta
        double delta = b * b - 4 * a * c;
        double x1 , x2;

        // kiem tra dieu kien cua delta de tim nghiem cho pt
        if(a == 0) {
            System.out.println("Gia tri a phai khac 0 de phuong trinh nay la phuong trinh bac 2");

        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("phuong trinh co 2 nghiem phan biet ");


        }
        else if (delta == 0 ) {
            x1 = -b / (2*a);
            System.out.println("Phuong trinh co nghiem kep : x = " + x1);

        }else {
            System.out.println("Phuong trinh vo nghiem");

        }
        scanner.close();
    }
}
