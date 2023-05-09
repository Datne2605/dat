package Students;

import java.util.Scanner;

public class Students {
    public static Students Fullname;
    public static int Age = Integer.parseInt(infoArr[1]);;

    public static void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        Fullname = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        Age = sc.nextInt();

    }

    public static void HienThi() {

        System.out.println("Ten la : " + Fullname + " Tuoi la :" + Age);

    }

}
