import java.util.ArrayList;
import java.util.Scanner;

import Sets.Students;

public class silde112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> arrList = new ArrayList<>();
        String Fullname;
        int diem, n;
        System.out.println("So luong sinh vien :");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Sinh vien thu " + i + "la :");
            System.out.println("Nhap ten sinh vien :");
            Fullname = sc.nextLine();
            System.out.println("Nhap diem : ");
            diem = sc.nextInt();

        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println("Nhap vao sinh vien can them : ");
            String studentName = sc.nextLine();
            if (studentName.isEmpty()) {

                break;
            }
            arrList.add(studentName);
        }

    }

}
