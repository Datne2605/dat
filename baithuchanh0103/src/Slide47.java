import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int x, tong = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhap vao mot so nguyen:");
            x = scanner.nextInt();
            tong = tong + x;
        } while (tong < 100);

        System.out.println("tong cac so da nhap = tong+x ");

    }
}
