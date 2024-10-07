package UTS;

import java.util.Scanner;

/*
Nama : La ode ian
Nim  : 3420210002
Prodi: Teknik Infor6matika
*/
public class UTS2 {

public static void garis(){
        System.out.println("============================================");
    }
    
    public static void judul(){
        garis();
        System.out.println("\tProgram Aritmatika");
        garis();
        System.out.println("1. Menghitung Lingkaran");
        System.out.println("2. Menghitung Segitiga");
        System.out.println("3. Menghitung Persegi Panjang");
        garis();
    }
    
    public static void lingkaran(){
        int jari; double luas; double keliling;
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan jari jari: ");
        jari = masukan.nextInt();
        luas = Math.PI * jari * jari;
        keliling = 2 * Math.PI * jari;
        System.out.printf("luas lingkaran adalah: %.2f%n", luas);
        System.out.printf("keliling lingkaran adalah: %.2f%n", keliling);
    }
    
    public static void segitiga(){
        int alas; int tinggi; double luas;
    Scanner masukan = new Scanner(System.in);
        System.out.print("masukan alas: ");
        alas = masukan.nextInt();
        System.out.print("masukan tinggi: ");
        tinggi = masukan.nextInt();
        luas = 0.5 * alas * tinggi;
        System.out.printf("luas segitiga adalah: %.2f%n", luas);
    }
    
    public static void persegi_panjang(){
        int lebar; int panjang; int keliling; int luas;
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan panjang: ");
        panjang = masukan.nextInt();
        System.out.print("masukan lebar: ");
        lebar = masukan.nextInt();
        luas = panjang * lebar;
        keliling = ( 2 * panjang) + ( 2 * lebar);
        System.out.printf("luas persegi panjang adalah: %d%n", luas);
        System.out.printf("keliling persegi panjang adalah: %d%n", keliling);
        
    }
      public static void main(String[] args) {
        int pilihan; String ulang = "y";
        judul();
        while ("y" .equals(ulang)){
            Scanner input = new Scanner(System.in);
            System.out.print("masukan kode [1/2/3]: ");
            pilihan = input.nextInt();
            garis();
            switch (pilihan){
                case 1 -> lingkaran();
                case 2 -> segitiga();
                default -> persegi_panjang();
            }
            System.out.print("mau input lagi?");
            ulang = input.next();
        }
    }
}