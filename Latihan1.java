package pertemuan6;

import java.util.Scanner;

/*
Nama : la ode ian
nim  : 3420210002
Prodi: Teknik Informatika
 */
public class Latihan1 {
    
    public static String nama;
    public static String jenis_kelamin;
    public static int umur;
    public int coba;
    
    //contoh kontruktor
    
    public Latihan1(int No_Karyawan) {
        System.out.println();
        garis();
        System.out.println(" No Karyawan yang dipilh adalah: " + No_Karyawan);
        garis();
    }
    
    public void Set_Nama(int no) {
        switch (no){
            case 1: nama = "Batesda sinaga"; break;
            case 2: nama = "Rudi Budiawa"; break;
            case 3: nama = "Arifah Hidayah"; break;
            default: nama = "Kode salah"; break;
        }
    }
    
    public static void Set_JK(int no){
        switch (no){
            case 1: jenis_kelamin= "wanita"; break;
            case 2: jenis_kelamin = "Pria"; break;
            case 3: jenis_kelamin = "wanita"; break;
            default: jenis_kelamin = "Kode salah"; break;
        }
    }
    
    public static void garis(){
        String simbol = "+";
        int i = 0;
        while (i <= 38){
            System.out.print(simbol);
            i = i + 1;
        }
        System.out.println();
    }    
        public static void judul(){
           garis();
           System.out.println("      Program data Karyawan");
           garis();
        }
        
        //contoh Switch
        public int set_umur(int no){
            int nilai_umur;
            switch (no){
                case 1:
                    nilai_umur = 27;
                    break;
                case 2:
                    nilai_umur = 28;
                    break;
                case 3:
                    nilai_umur = 22;
                    break;    
                default: nilai_umur = 0; break;        
            }
        return nilai_umur;
        }
        
        public static void data_karyawan(){
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("No  Nama               Jenis kelamin  Umur ");
            System.out.println("-------------------------------------------");
            System.out.println("1   Betesda sinaga      wanita         27");
            System.out.println("2   Rudi Budiawan       Pria           28");
            System.out.println("3   Arifah Hidayah      wanita         22");
            System.out.println();
        }

    public static void main(String[] args) {
        int no_kar;
        judul();
        data_karyawan();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan No Karyawan : ");no_kar = input.nextInt();
        //crreat object
        
        Latihan1 Info_Karyawan = new Latihan1(no_kar);
        Info_Karyawan.Set_Nama(no_kar);
        System.out.println("Nama Karyawan : " + nama);
        Set_JK(no_kar);
        System.out.println("Jenis kelamin : " + Latihan1.jenis_kelamin);
        umur = Info_Karyawan.set_umur(no_kar);
        System.out.println("Umur          : " + Latihan1.umur);
        garis();
    }
}