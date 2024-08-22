import java.util.Scanner;

public class diskon {
    private static final Scanner Input = null;

    public static void main(String[] args) {
        double harga_barang;
        double jumlah_barang;
        double diskon_barang;
        double hasil_akhir;
        Scanner scanner = new Scanner(System.in);


    System.out.println("Masukkan harga barang");
    harga_barang = Input.nextDouble();
    System.out.println("masukkan jumlah barang");
    jumlah_barang = Input.nextDouble();
    System.out.println("masukkan diskon");
    diskon_barang = Input.nextDouble();
    double total_harga_barang;
    total_harga_barang = harga_barang * jumlah_barang;
    diskon_barang=diskon_barang/100;
    hasil_akhir =total_harga_barang-diskon_barang;
    System.out.println("total harga barang adalah"+hasil_akhir);

    

    }
    
}
