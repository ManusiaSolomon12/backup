package UTS;

import java.util.Scanner;

/*
Nama : La ode ian
Nim  : 342010002
Prodi: Teknik INformatika
 */
public class UTS1{

public static String Nama;
    public static String Film;
    public static String Alamat;
    public static int Lama;
    public static int Pilihan;
    public static int Pilih;
    public static int Harga;
    
    public static void Garis(int lebar) {
        int i;
        for (i=1;i<=lebar;i++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }
    
    public static void daftar_harga() {
        System.out.println("Daftar Harga:");
        System.out.println("1. Pocong Versus Aliens    -> CAM : 5500");
        System.out.println("                           -> HD  : 6500");
        System.out.println("2. Ber*k Dalam Kubur       -> CAM : 6000");
        System.out.println("                           -> HD  : 7000");
        System.out.println("3. Marwoto Sippuden        -> CAM : 7500");
        System.out.println("                           -> HD  : 8000");
        Garis(50);
        System.out.println("Ketentuan Lain:");
        System.out.println("Jika Lama Sewa > 10 hari maka Diskon 10%");
        System.out.println("Jika Lama Sewa > 5  hari maka Diskon 5%");
        Garis(50);
    }
    
    public static void Judul() {
        Garis(50);
        System.out.println("\tProgram Penyewaan Film Bajakan");
        Garis(50);
        System.out.println("Daftar Film:");
        System.out.println("1. Pocong Versus Aliens");
        System.out.println("2. Ber*k Dalam Kubur");
        System.out.println("3. Marwoto Sippuden");
        System.out.println("Kualitas Film:");
        System.out.println("1. CAM");
        System.out.println("2. HD");
        Garis(50);
    }
    
    public static void Input_masukan() {
        Scanner baca = new Scanner(System.in);
        System.out.println("Insert Data");
        System.out.print("Nama Customer     : "); Nama = baca.nextLine();
        System.out.print("Alamat            : "); Alamat = baca.nextLine();
        System.out.print("Film [1/2/3]      : "); Pilihan = baca.nextInt();
        System.out.print("Kualitas          : "); Pilih = baca.nextInt();
        System.out.print("Lama Sewa         : "); Lama = baca.nextInt();
    }
    
    public static void cetak() {
        System.out.print("\n");
        Garis(50);
        System.out.println("Data Penyewaan Film");
        Garis(50);
        System.out.println("Nama Customer    : " + Nama);
        System.out.println("Alamat           : " + Alamat);
        System.out.println("Judul Film       : " + Film);
        System.out.println("Lama Sewa        : " + Lama);
        System.out.println("Harga Sewa       : " + Harga);
        long Total = Hitung_Total(Harga, Lama);
        double Diskon = Hitung_Diskon(Lama, Total);
        double Grand = Hitung_Grand(Total,Diskon);
        System.out.println("Subtotal         : " + Total);
        System.out.println("Diskon           : " + Diskon);
        System.out.println("Grand Total      : " + Grand);
    }
    
    public static String Pilihan_Film() {
    return switch (Pilihan) {
        case 1 -> "Pocong Versus Aliens";
        case 2 -> "Ber*k Dalam Kubur";
        case 3 -> "Marwoto Sippuden";
        default -> "MAAF FILM TIDAK TERSEDIA";
    };
   
    }
    
    public static String Pilihan_Film_2(int Pilih) {
    return switch (Pilih) {
        case 1 -> "Pocong Versus Aliens";
        case 2 -> "Ber*k Dalam Kubur";
        case 3 -> "Marwoto Sippuden";
        default -> "MAAF FILM TIDAK TERSEDIA";
    };
    }
    
    public static int Harga_Sewa(int Hrg_Sewa) {
        switch (Hrg_Sewa) {
            case 1 -> {
                if(Pilih == 1) {
                    return 5500;
                }else{
                    return 6500;
                }
        }
            case 2 -> {
                if(Pilih == 1) {
                    return 6000;
                }else{
                    return 7000;
                }
        }
            default -> {
                if(Pilih == 1) {
                    return 7500;
                }else{
                    return 8500;
                }
        }
        }
    }
    
    public static long Hitung_Total(int Harga, int Jumlah) {
        long Hasil;
        Hasil = Harga * Jumlah;
        return Hasil;
    }
    
    public static double Hitung_Diskon(int Jumlah, long Bayar) {
        if(Jumlah > 10) {
            return 0.1 * Bayar;
        }else if(Jumlah > 5) {
            return 0.05 * Bayar;
        }else{
            return 0;
        }
    }
    
    public static double Hitung_Grand(long Total, double Diskon) {
        return Total - Diskon;
    }
    
    public static void Perhitungan() {
        Film = Pilihan_Film();
        Harga = Harga_Sewa(Pilihan);
    }
    
    public static void main(String[] args) {
        Judul();
        daftar_harga();
        Input_masukan();
        Perhitungan();
        cetak();
    }
}    