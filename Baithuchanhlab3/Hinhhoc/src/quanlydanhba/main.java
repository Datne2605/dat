package quanlydanhba;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        contactAB danhba = new contactAB();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua danh ba: ");
        int A = sc.nextInt();
        String arrTen[] = new String[A];
        String arrSDT[] = new String[A];
        danhba.Add(arrTen, arrSDT);
        danhba.Delete(arrTen, arrSDT);
        danhba.Update(arrTen, arrSDT);
        danhba.Search(arrTen, arrSDT);
    }

}
