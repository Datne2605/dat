import java.lang.reflect.Array;
import java.util.ArrayList;

public class slide17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(0);
        arrList.add(7);
        arrList.add(1);
        arrList.add(9);

        System.out.println("Cac phan tu trong mang la : ");

        for (Integer number : arrList) {

            System.out.println(number);
        }
    }

}
