package Sets;

import java.util.Scanner;
import java.util.Set;

public class Students {
    public static String Fullname;
    public static int Age;

    public static void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        Fullname = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        Age = sc.nextInt();

    }

    public static void Hienthi() {

        System.out.println("Ten la : " + Fullname);
        System.out.println("Tuoi la : " + Age);

    }

}
