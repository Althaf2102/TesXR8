import java.util.Scanner;

public class bruto {
    public static void main(String[] args) {
        int Jam_kerja;
        int tarif_per_jam;
        double bruto;
        double netto;
        double pembagi = 10;
        double hasil_akhir;
        Scanner scan = new Scanner(System.in); 
    
    
    System.out.println("Berapa jam kamu bekerja?");
    Jam_kerja = scan.nextInt();
    System.out.println("Berapa tarif per jam?");
    tarif_per_jam = scan.nextInt();
    bruto =Jam_kerja*tarif_per_jam;
    System.out.println("Brotomu adalaj"+bruto);
    pembagi = pembagi / 50;
    netto = bruto*pembagi;
    System.out.println("Nettomu adalah"+netto);
    hasil_akhir = bruto - netto;
    System.out.println("hasil akhir adalah"+hasil_akhir);
    }
}
    