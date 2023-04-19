import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int x, tong = 0;
        Scanner scanner = new Scanner(System.in);

        while (tong < 100) {
            System.out.print("Nhap so nguyen: ");
            x = scanner.nextInt();

            tong = tong + x;

        }
        System.out.println("Tong cac so da nhap la: " + tong);

        scanner.close();
    }
}