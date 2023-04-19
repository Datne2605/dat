package shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {

    public float chieucao;

    public Hinhtru() {
        ten = "Hinh tru";
    }

    public void Nhapchieucao() {
        Nhapbankinh();

        System.out.println("Chieu cao =");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }

    public void Tinhthetich() {

        Tinhthetich();
        thetich = dientich * chieucao;

    }

}
