package pertemuan3;

import static java.time.Clock.system;

/*
Nama : La ode ian 
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class rejex2 {

    public static void main(String[] args) {
        String kata1 = "abc"; String kata2 = "abc def"; 
        System.out.println("String kata1 adalah: " + kata1);
        System.out.println("String kata2 adalah: " + kata2);
        System.out.println("Hasil pengecekan abc pada variable kata1: ");
        if (kata1.matches("abc")) { System.out.println("Ditemukan.");}
        else { System.out.println("Tidak di temukan."); }
            System.out.println("Hasil pengecekan abc variabel kata2: ");
            if (kata2.matches("abc")) { System.out.println("Di temukan"); }
            else { System.out.println("Tidak ditemukan");
            
        }    
    }    
}
