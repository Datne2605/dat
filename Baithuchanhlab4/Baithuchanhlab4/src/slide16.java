import java.util.ArrayList;

public class slide16 {
    public static void main(String[] args) {
        ArrayList<String> arrListString = new ArrayList<>();

        arrListString.add("java");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        System.out.println("cac phan tu co trong mang la :");

        for (int i = 0; i < arrListString.size(); i++)

        {
            System.out.println(arrListString.get(i) + "\t");
        }

    }

}