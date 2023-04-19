import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int x, i = 1;
        long giaiThua = 1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap vao 1 so bat ki: ");
            x = sc.nextInt();
        } while ((x <= 0) || (x > 10));

        while (i <= x) {
            giaiThua *= i;
            i++;
        }

        System.out.println(x + "!= " + giaiThua);
    }

}
