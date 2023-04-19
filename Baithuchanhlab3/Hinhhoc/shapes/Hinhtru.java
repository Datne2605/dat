package shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {

    public float chieucao;

    public Hinhtru() {
        ten = "Hinh tru";
    }

    public void Nhapchieucao() {
        r();

        System.out.println("Chieu cao =");
        Scanner sc = new Scanner(System.in);
        h = sc.nextFloat();
    }

    public void Tinhthetich() {

        Tinhthetich();
        thetich = dientich * chieucao;

    }

}
