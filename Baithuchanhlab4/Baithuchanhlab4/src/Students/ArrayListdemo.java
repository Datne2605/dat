package Students;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> arrList = new ArrayList<>();
        System.out.println("Nhap vao so luong students : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Sinh vien thu " + i + " la : ");
            Students std = new Students();
            std.NhapThongTin();
            arrList.add(std);

        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println("Danh sach vua nhap la : ");
            System.out.println(arrList.get(i));

            Students std = new Students();
            std.Hienthi();
        }

    }

}
