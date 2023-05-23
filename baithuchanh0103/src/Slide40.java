import java.util.Scanner;

public class Slide40 {
   public static void main(String[] arg) {
      Scanner sc = new Scanner(System.in);

      int tuan;
      System.out.println("nhap gia tri tu 1 den 7");
      tuan = sc.nextInt();
      switch (tuan) {
         case 1:
            System.out.println("chu nhat");
            break;
         case 2:
            System.out.println("thu hai");
            break;
         case 3:
            System.out.println("thu ba");
            break;
         case 4:
            System.out.println("thu tu");
            break;
         case 5:
            System.out.println("thu nam");
            break;
         case 6:
            System.out.println("thu sau");
            break;
         case 7:
            System.out.println("thu bay");
            break;

         default:
            System.out.println("so nhap vao phai nam trong khoang tu 1 den 7");
      }

   }
}