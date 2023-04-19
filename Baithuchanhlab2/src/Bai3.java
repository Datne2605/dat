import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int tuoi, nam;
        String ten, sotuoi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten:");
        ten = sc.nextLine();
        System.out.println("Nhap vao nam sinh:");
        nam = sc.nextInt();

        tuoi = 2023 - nam;
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " vi thanh nien ");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " dang truong thanh ");
        } else if (tuoi >= 18) {
            System.out.println("Ban " + ten + " da gia ");

        }

    }
}
