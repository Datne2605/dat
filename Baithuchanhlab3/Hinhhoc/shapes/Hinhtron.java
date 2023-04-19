
package shapes;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {

    public float bankinh;

    public Hinhtron() {
        ten = "Hinhtron";
    }

    public void Nhapbankinh() {
        System.out.println("bankinh =");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }

    public void Tinhchuvi() {

        chuvi = 2 * PI * bankinh;
    }

    public void Tinhdientich() {

        dientich = PI * bankinh * bankinh;
    }

}
