package Students;

import java.util.Scanner;

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

    // public static void Hienthithongtin(ArrayList<Students> arrList) {
    // for (Students std : arrList) {
    // System.out.println(std.Fullname);
    // System.out.println(std.Age);

    // }

    // public static void Update(ArrayList<Students> arrList) {
    // for (int i = 0; i < arrList.size(); i++) {
    // Scanner sc = new Scanner(System.in);
    // Students name = new Students();
    // if (arrList.get(i).Fullname.equals(name)) {

    // }

}
