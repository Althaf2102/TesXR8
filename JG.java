import java.util.Scanner;

public class JG {
    public static void main(String[] args) {
        double alas,tinggi,hasil;
        Scanner Input = new Scanner(System.in);
        System.out.println("Masukan alas jajar genjang");
        alas = Input.nextDouble();
        System.err.println("masukkan tinggi jajar genjang");
        tinggi = Input.nextDouble();
        hasil=alas*tinggi;
        System.out.println("hasil luas jajar genjang"+hasil);
        
    }
    
}
