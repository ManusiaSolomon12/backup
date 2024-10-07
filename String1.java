package pertemuan2;
import java.util.Scanner;
/*
Nama :la ode ian 
Nim  :3420210002
Prodi:Teknik Informatika
 */
public class String1 {

    public static void main(String[] args) {
     //judul
     System.out.println("contoh Input Output String");
     System.out.print("++++++++++++++++++++++++++\n");
     
     //Deklarasi Variable
     String nama_belakang = null;
     String nama_lengkap;
     String nama_depan;
     
     Scanner masukan; 
     masukan = new Scanner(System.in);
     
     //Input
     System.out.print("Masukan sebuah nama depan\t: ");
     nama_depan = masukan.nextLine();
     System.out.print("Masukan sebuah nama belakang\t: ");
     nama_lengkap = nama_depan + ' ' + nama_belakang;
     System.out.println("Nama lengkap anda adalah: " + nama_lengkap);
    }
    
}
