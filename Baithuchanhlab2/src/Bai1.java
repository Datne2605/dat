import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat:");
        int a = sc.nextInt();
        System.out.println("nhap vao so thu hai:");
        int b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);

        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);

        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);

        int thuong = a / b;
        System.out.println(a + " / " + b + " = " + thuong);

        int phandu = a % b;
        System.out.println(a + " % " + b + " =" + phandu);

        System.out.println("Ket qua so sanh bang 2 so " + a + " va " + b + " la " + (a == b));

        System.out.println("Ket qua so sanh lon hon 2 so " + a + " va " + b + " la " + (a > b));

        System.out.println("Ket qua so sanh lon hon hoac bang 2 so " + a + " va " + b + " la " + (a >= b));

        System.out.println("Ket qua so sanh be hon 2 so " + a + " va " + b + " la " + (a < b));

        System.out.println("Ket qua so sanh be hon hoac bang 2 so " + a + " va " + b + " la " + (a <= b));

    }
}