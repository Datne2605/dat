package students112;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class students {
    String ten;
    float diem;

    public void nhaptt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
        ten = sc.nextLine();
        System.out.println("Nhap diem :");
        diem = sc.nextFloat();
    }

    public void intt() {
        System.out.println("ten " + ten);
        System.out.println("diem " + diem);
    }

    public void addtt(List<students> A) {
        while (true) {
            students sv = new students();
            sv.nhaptt();

            if (sv.ten.equals("")) {
                break;
            }
            A.add(sv);
        }
    }

    public void inttm(List<students> B) {
        System.out.println("danh sach sv ");
        for (students svv : B) {
            svv.intt();
        }
    }

    public void thilai(List<students> C) {
        System.out.println("danh sach hoc sinh thi lai :");
        for (int i = 0; i < C.size(); i++) {
            if (C.get(i).diem <= 5) {
                System.out.println("\n" + C.get(i).ten);
            }
        }
    }

    public void MAX(List<students> D) {
        System.out.println("danh sach hoc sinh Diem cao :");
        float max = D.get(0).diem;
        for (int i = 1; i < D.size(); i++) {
            if (D.get(i).diem >= max) {
                System.out.println("\n" + D.get(i).ten);
            }
        }
    }

    public void timkiem(List<students> E) {
        Scanner scc = new Scanner(System.in);
        String t;
        System.out.println("Nhap ten xem diem: ");

        t = scc.nextLine();

        for (int i = 0; i < E.size(); i++) {
            if (E.get(i).ten.equals(t)) {
                System.out.printf("Diem cua %s la %f ", t, E.get(i).diem);
            }
        }

    }

    public static void main(String[] args) {
        LinkedList<slide112> svList = new LinkedList<>();
        slide112 std = new slide112();
        std.addtt(svList);
        std.inttm(svList);
        std.thilai(svList);
        std.MAX(svList);
        std.timkiem(svList);
    }

}