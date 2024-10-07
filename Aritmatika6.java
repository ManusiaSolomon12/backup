package pertemuan2;

import java.util.Scanner;
/*
Nama :la ode ian
Nim  :3420210002
Prodi:Teknik Informatika
 */
public class Aritmatika6 {

    public static void main(String[] args) {
    System.out.println("===================================");
    System.out.println("     Toko Makanan Semoga Halal");
    System.out.println("====================================");
    System.out.println("Daftar Makanan           Harga");
    System.out.println("1. Nasi Goreng  Ayam    15.000");
    System.out.println("2. Nasi Goreng SPEAFOOD  17.000");
    System.out.println("3. Nasi Goreng SPESIAL   20.000");
    System.out.println("=====================================");
    System.out.println("Daftar Minuman           Harga");
    System.out.println("1. ES TEH MANIS          3.000");
    System.out.println("2. JUS MANGGA            6.000");
    System.out.println("======================================");
    Scanner Input = new Scanner (System.in);
    String Nama;
    int Kode_Makanan;
    int Kode_Minuman;
    int Harga_Makanan;
    int Harga_Minuman;
    int Total;
    System.out.print("Masukan Nama        : ");Nama = Input.nextLine();
    System.out.print("Kode Makanan [1/2/3]: ");Kode_Makanan = Input.nextInt();
    System.out.print("Kode Minuman [1/2]  : ");Kode_Minuman = Input.nextInt();
    System.out.println("====================================");
    if(Kode_Makanan == 1){
        Harga_Makanan = 15000;    
    } else if (Kode_Makanan == 2) {
        Harga_Makanan = 17000;
    } else {
        Harga_Makanan = 20000;    
    }
    if(Kode_Minuman == 1){
        Harga_Minuman = 3000;
    } else {
        Harga_Minuman = 8000;
    }
    Total = Harga_Makanan + Harga_Minuman;
    System.out.println("Terima kasih " + Nama +
            "Total yang harus bayar anda adalah: " + Total);
 }
    
}
