package Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Students> LinkSet = new LinkedHashSet();
        System.out.println("Nhap vao so luong hoc sinh :");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("Hoc sinh thu " + i + " la : ");
            Students std = new Students();
            std.NhapThongTin();
        }
        for (Students std : LinkSet) {
            System.out.println("%d /t", std);
            std.Display(LinkSet);
        }

    }

}
