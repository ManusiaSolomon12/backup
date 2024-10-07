package pertemuan4;
import java.util.Scanner;

/*
Nama : la ode ian
Niim : 3420210002
Prodi: Teknik Informatika
 */
public class fungsi3 {

    public static void garis() {
        System.out.println("=================================");
    }
    /*Procedure      
       Merupakan suatu program terpisah dalam blok tersendiri yang berfungsi sebagai 
       subprogram (program bagian)
       Untuk menjalankan prosedur cukup dipanggil ditulis namanya saja
    */
    public static void judul(){
        garis();
        System.out.println("\tProgram contoh fungsi dan Prosedur");
        System.out.println("Pilihan 1 menghitung lingkaran");
        System.out.println("Pilihan 2 Menghitung persegi panjang");
        garis();
    }
    
    public static void lingkaran(){
        int jari;
        double luas;
        double kell;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan panjang jari-jari: ");
        jari = masukan.nextInt();
        System.out.print("Masukan panjang jari-jari: ");
        jari = masukan.nextInt();
        luas = Math.PI * jari * jari; 
        kell = 2 * Math.PI * jari;
        System.out.printf("Luas lingkaran adalah: %.2f%n",luas);
        System.out.printf("Keliling lingkaran adalah: %.2f%n",kell);
    }
    
    public static void persegi(){
        int panjang;
        int tinggi; 
        int luas = 0; 
        int kell;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan panjang persegi: ");
        panjang = masukan.nextInt();
        System.out.print("Masukan tinggi persegi: ");
        tinggi = masukan.nextInt();
        kell = (2 * panjang) + (2 * tinggi);
        System.out.printf("Luas persegi adalah: %d%n", luas);
        System.out.printf("Keliling persegi adalah: %d%n",kell);  
    }
    
    public static void main(String args[]) {
        //Deklarasi variable 
    
     int pilihan;
     judul();
     Scanner baca = new Scanner(System.in);
     System.out.print("Masukan pilihan[1/2]: "); pilihan = baca.nextInt();
     if (pilihan == 1) {
      lingkaran();
     } else {
      persegi();
     }
   }
}
