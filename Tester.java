import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih 1. CD atau 2. DVD");
        int pilihan = in.nextInt();
        in.nextLine();
        if(pilihan == 1){
           System.out.println("Number :");
           String name = in.nextLine();
           String label = in.nextLine();
           String artist = in.nextLine();
           int number = in.nextInt();
           int quantity = in.nextInt();
           int numSong = in.nextInt();
           double price = in.nextDouble();
           System.out.println("Label :");
            CD cd1 = new CD(number,name,quantity,price,artist,numSong,label);
            cd1.print();
        }else if(pilihan == 2){
            System.out.println("Number :");
            String Name = in.nextLine();
            String rating = in.nextLine();
            String studio = in.nextLine();
            int Number = in.nextInt();
            int quantity = in.nextInt();
            int length = in.nextInt();
            Double price = in.nextDouble();
            System.out.println("Studio :");
            DVD dvd1 = new DVD(Number, Name, quantity, price, length, rating, studio);
            dvd1.print();
        }else{
            System.out.println("Input Salah");
        }
    }
}
