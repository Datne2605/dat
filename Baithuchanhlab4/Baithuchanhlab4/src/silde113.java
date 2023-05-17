import java.util.HashSet;
import java.util.Scanner;

public class silde113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TenTraiCay;
        int n;
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("So luong trai cay can nhap : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Trai cay thu " + i + "la :");
            TenTraiCay = sc.nextLine();
            hashSet.add(TenTraiCay);
        }
        System.out.println("So phan tu trong hashSet la : " + hashSet.size());
        boolean kt = false;
        for (int i = 0; i < hashSet.size(); i++) {

            System.out.println("Nhap loai trai cay can tim :");
            String searchTenTraiCay;
            searchTenTraiCay = sc.nextLine();
            if (searchTenTraiCay.equals(TenTraiCay)) {
                System.out.println("Co tim thay" + hashSet);

            }

        }

    }
}
