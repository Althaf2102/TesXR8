import java.util.Scanner;
public class satu{
    public static void main(String[] args) {
      int bilangan_awal=6;
      int bilangan_akhir=0;
      Scanner input = new Scanner(System.in);
      System.out.println("Maukkan bilangan awal");
      bilangan_awal=input.nextInt();
      System.out.println("Masukkan bilangan Akhir");
      bilangan_akhir=input.nextInt();
      System.out.println("----------------------------------");
      while (bilangan_awal<=bilangan_akhir) {
        System.out.print(bilangan_awal+",");
        bilangan_awal+=6;
        
      }



    }
}