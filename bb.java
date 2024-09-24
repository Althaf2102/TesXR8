import java.util.Scanner;

public class bb{
public static void main(String[] args) {
    int siswa;
    int jumlah_siswa;
    int beratBadan;
    double Totalberat=0;
    double rata_berat;

    Scanner nice = new Scanner(System.in);
    System.out.println("Jumlah Siswa:");
    jumlah_siswa=nice.nextInt();
    System.out.println("-----------------------------------------------------");
    for(siswa=1; siswa<=jumlah_siswa;siswa++){
        System.out.println("Masukkan berat Siswa ke-"+ siswa +":");
        beratBadan = nice.nextInt();
        Totalberat += beratBadan;
    }
    System.out.println("-----------------------------------------------------");
    rata_berat = Totalberat/jumlah_siswa;
    System.out.println("Rata rata berat badan dari siswa adalah:"+jumlah_siswa+"siswa adalah:"+rata_berat);
}
    
}

