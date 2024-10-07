package pertemuan9;

import java.util.Scanner;
import pertemuan8.prosedur1;

/*
Nama : La ode ian
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class prosedur3 {

    public static void main(String[] args) {
        prosedur1 objek = new prosedur1();
        Scanner Masukan = new Scanner(System.in);
        objek.Judul(); objek.ketentuan(); objek.turun(1);
        String Nama;
        int Jml_Data; int i;
        String[] Kode = new String[10];
        String[] Nama_obat = new String[10];
        int[] Jml_Beli = new int[10];
        int[] Jml_Strip = new int[10];
        int[] Jml_Butir = new int[10];
        long[] Subtotal = new long[10];
        System.out.print("Masukan Nama: "); Nama = Masukan.nextLine();
        System.out.print("Masukan Data: "); Jml_Data = Masukan.nextInt();
        objek.garis();
        for (i=1;i<=Jml_Data;i++){
            System.out.println("Data Ke " + i + " Dari " + Jml_Data + " Data");
            System.out.print("Kode obat          : "); Kode[i] = Masukan.next();
            System.out.print("Jumlah Beli (Butir): "); Jml_Beli[i] = Masukan.nextInt();
            objek.garis();
        }
        objek.turun(1); objek.Judul();
        System.out.println("Data penjualan obat");
        System.out.println("Nama pembeli: " + Nama);
        objek.garis();
        System.out.println("No Kode Jumlah Beli Jumlah Strip Jumlah Butir Nama Obat Subtotal ");
        objek.garis();
        int Total_Beli=0;
        int Total_Strip=0;
        int Total_Butir=0;
        int Total_Subtotal=0;
        
        for (i=1;i<=Jml_Data;i++) {
            Nama_obat[i] = objek.Nama_Obat(Kode[i]);
            Subtotal[i] = objek.Subtotal(Nama_obat[i],Jml_Beli[i]);
            Jml_Strip [i] = Jml_Beli[i] / 4;
            Jml_Butir [i] = Jml_Beli[i] % 4;
            System.out.print(String.format("%-4s",1));
            System.out.print(String.format("%-6s",Kode[i]));
            System.out.print(String.format("%-13s",Jml_Beli[i] + "Butir"));
            System.out.print(String.format("%-14s",Jml_Strip[i] + "Strip"));
            System.out.print(String.format("%-14s",Jml_Butir[i] + "Butir"));
            System.out.print(String.format("%-11s",Nama_obat[i]));
            System.out.print(String.format("%-10s",Subtotal[i]));
            System.out.println();
            Total_Beli = Total_Beli + Jml_Beli[i];
            Total_Strip = Total_Strip + Jml_Strip[i];
            Total_Butir = Total_Butir + Jml_Butir[i];
            Total_Subtotal = (int) (Total_Subtotal + Subtotal[i]);
        }
        objek.garis();
          System.out.print(String.format("%-10s","TOTAL"));
          System.out.print(String.format("%-13s",Total_Beli  + " Butir"));
          System.out.print(String.format("%-14s",Total_Strip + " Strip"));
          System.out.print(String.format("%-25s",Total_Butir + " Butir"));
          System.out.print(String.format("%-11s",Total_Subtotal));
          objek.turun(i);
          objek.garis();
    }   
}
