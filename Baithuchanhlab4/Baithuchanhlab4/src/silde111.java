import java.util.LinkedList;
import java.util.Scanner;

public class silde111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkList = new LinkedList<>();
        System.out.println("Nhap vao so phan tu n : : ");
        int n = sc.nextInt(), Tong = 0, TBC = 0, sochan = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Phan tu thu " + i + " la :");
            int number = sc.nextInt();

            if (number % 2 == 0) {

                Tong += number;
                sochan++;

            }

        }
        TBC = Tong / sochan;
        System.out.println("Trung binh cong cac phan tu chan la : " + TBC);

    }

}
