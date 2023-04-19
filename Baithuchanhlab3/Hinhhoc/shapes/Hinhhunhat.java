package shapes;

import java.util.Scanner;

public class Hinhhunhat extends Hinhhoc {
    public float dai, rong;

    public Hinhchunhat() {
        ten = "Hinh chu nhat";
    }

    public void Nhapchieudai() {
        System.out.println("chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }

    public void Nhapchieurong() {
        System.out.println("chieu rong =");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = 2 * (dai + rong);

    }

    public void tinhdientich() {
        dientich = dai * rong;
    }
}
