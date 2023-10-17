import java.util.Scanner;
public class HitungIP26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama, namaMataKuliah, perbaikan;
        
        int jumlahSKS, jumlahMK;
        double IPnilai, totalIP, totalSKS;
        String nilai;

        for (int i = 0; i < jumlahMK; i++) {
        System.out.println("Program Hitung IP");
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Nama Mata Kuliah: ");
        namaMataKuliah = sc.nextLine();
        System.out.print("Nilai (A,B+,B,C+,C,D,E): ");
        nilai = sc.next();
        System.out.print("Masukkan jumlah SKS: ");
        jumlahSKS = sc.nextInt();

        switch (nilai) {
            case "A":
                IPnilai = 4.0;
                break;
            case "B+":
                IPnilai = 3.5;
                break;
            case "B":
                IPnilai = 3.0;
                break;
            case "C+":
                IPnilai = 2.5;
                break;
            case "C":
                IPnilai = 2.0;
                break;
            case "D":
                IPnilai = 1.0;
                break;
            case "E":
                IPnilai = 0.0;
                break;

            default:
            System.out.println("Nilai yang anda masukkan tidak ada");
        } 
            totalSKS += jumlahSKS;
            totalBobot += nilai * jumlahSKS;

            if (nilai.equals("D") || nilai.equals("E")) {
                perbaikan++;
            }

        System.out.println("--------Hasil Perhitungan IP--------");
        System.out.println("Nama                  : " +nama);
        System.out.println("Indeks Prestasi (IP)  : " +totalBobot);
        System.out.println("Jumlah Mata Kuliah    : " +namaMataKuliah);
        System.out.println("Jumlah SKS            : " +jumlahSKS);
        System.out.println("Jumlah MK yang harus perbaikan/remidi: " +perbaikan);
        System.out.println("------------------------------------");
        
        }
    }
}