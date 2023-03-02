public class Silede55 {

    public static void main(String[] args) {

        System.out.println("Cac so chia het cho 5 la: ");

        for (int i = 1; i <= 200; i++) {

            if (i % 5 != 0) {

                continue;

                System.out.println(i);
            }
        }
    }
}