package pertemuan3;

import java.util.Scanner;

/*
Nama : La ode ian 
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class Array2 {

    public static void main(String[] args) {
               Scanner Masukan = new Scanner(System.in);
        System.out.println("Masukan Bilangan Integer");
        int i; int Bil[]; Bil = new int[5];
        //Looping
        for (i=0;i<=4;i++) {
            System.out.printf("Masukan bilangan ke-%d: ", i);
            Bil[i] = Masukan.nextInt();
        }
        System.out.println("       \nInput Data Berhasil");
        System.out.println("====================================");
        for (i=0;i<=4;i++) {
            System.out.printf("Bilangan ke-%d adalah: %d%n",i,Bil[i]);
        }
    }
}
