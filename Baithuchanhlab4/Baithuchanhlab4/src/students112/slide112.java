package students112;

import java.util.ArrayList;
import java.util.Scanner;

public class slide112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<students> arrList = new ArrayList<>();
        System.out.println("Nhap vao so luong hoc sinh : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Sinh vien thu " + i + " la : ");
            students std = new students();
            std.nhaptt();
            arrList.add(std);

        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println("Danh sach vua nhap la : ");
            students std = new students();
            std.intt();

        }

    }

}
