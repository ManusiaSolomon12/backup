package pertemuan6;

import java.util.Scanner;
/*
Nama : la ode ian
Nim  : 3420210002
Prodi: Teknik Informatika
 */

public class Fungsi7 {
    public static void garis() {
        System.out.println("=================================================");
    }
    
    public static void judul() {
        garis();
        System.out.println("                 Program Rumah Sakit");
        garis();
    }
    
    public static void data_tabel() {
        System.out.println("Tabel       1.Poli Anak 2.Poli Kulit 3.Poli Jiwa");
        garis();
        System.out.println("(L)Pria       75.000      60.000      550.000");
        System.out.println("(P)Wanita     65.000      125.000     300.000");
        garis();
    }
    
    public static String JK_Name(char jk) {
        String gender;
        gender = switch (jk) {
            case '1', 'L' -> "Pria";
            default -> "Wanita";
        };
        return gender;
    }
    
    public static String Poli_Name(int Kode) {
        String Nama;
        if(Kode == 1) {
            Nama = "Poli Anak";
        } else if (Kode == 2) {
            Nama = "Poli Kulit";
        } else {
            Nama = "Poli Jiwa";
        } return Nama;
    }
    
    public static double Harga(char jk, int poli) {
        double harga_poli;
        if(poli == 1) {
            switch(jk) {
                case '1': case 'L': harga_poli = 75000; break;
            default:
                harga_poli = 65000;
            }
        } else if (poli == 2) {
            switch(jk) {
                case '1': case 'L': harga_poli = 60000; break;
            default:
                harga_poli = 125000;
            }
        } else {
            switch(jk) {
                case '1': case 'L': harga_poli = 550000; break;
            default:
                harga_poli = 300000;
            }
        }
        return harga_poli;
    }
    
    public static void main(String[] args) {
        judul();
        data_tabel();
        Scanner input = new Scanner(System.in);
        String nama; int umur; char jk; int poli;
        System.out.print("Masukan nama pasien         : "); nama = input.nextLine();
        System.out.print("Masukan umur                : "); umur = input.nextInt();
        System.out.print("Masukan jenis kelamin [l/P] : "); jk = input.next().charAt(0);
        System.out.print("Masukan kode poli [1/2/3]   : "); poli = input.nextInt();
        judul();
        System.out.println("Nama pasien adalah     : " + nama);
        System.out.println("Umur pasien adalah     : " + umur);
        System.out.println("Jenis kelamin adalah   : " + JK_Name(jk));
        System.out.println("Pilihan Poli           : " + Poli_Name(poli));
        System.out.printf("Harga Poli           : Rp %,.0f\n" , Harga(jk, poli));
        garis();
    }
}
