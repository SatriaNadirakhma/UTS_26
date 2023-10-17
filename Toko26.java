import java.util.Scanner;
public class Toko26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama, produk, subTotal;
        double totalDiskon, totalBayar;
        int qty, harga;


        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda: ");
        nama = sc.nextLine();

        do {
            System.out.print("Masukkan produk yang Anda beli: ");
            produk = sc.nextLine();
            System.out.println("Banyaknya: ");
            qty = sc.nextInt();
            System.out.println("Harganya: ");
            harga = sc.nextInt();
        } while (condition);

        subTotal

        System.out.println("--------Total Pembelian--------");
        System.out.print("Nama Pelangan: " +nama);
        System.out.print("Tipe: " +tipePembayaran);
        System.out.print("Total item barang yang dibeli: " +qty);
        System.out.print("SubTotal                 = " +subTotal);
        System.out.print("Total Diskon             = " +totalDiskon);
        System.out.print("Total Yang Harus Dibayar = " +totalBayar);
        System.out.println("-------------------------------");
    }
}
