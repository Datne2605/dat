import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
    public static void main(String[] args) {

        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println("cac phan tu co trong ListChar la : ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }

    }

}
