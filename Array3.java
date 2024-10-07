package pertemuan4;
import java.util.Scanner;
/*
Nama : La ode ian 
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class Array3 {
    
    public static void main(String[] args) {
    int A[][] ; 
    A = new int[3][2]; 
    Scanner Masukan = new Scanner(System.in);
    int i, y;
    System.out.println("====================================");
    System.out.println("\tPROGRAM ARRAY DIMENSI 2");
    System.out.println("====================================");
    for (i=0;i<=1;i++){
        for (y=0;y<=1;y++){
            System.out.printf("Masukan bilangan ke-[%d][%d]: ",i,y);
            A[i][y] = Masukan.nextInt();
        }
    }
    System.out.println("\n\n\n");
    System.out.println("====================================");
    System.out.println("\tinput Data Sukses");
    System.out.println("====================================");
    for (i=0;i<=1;i++){
        for (y=0;y<=1;y++){
            System.out.printf("Data ke-[%d][%d] adalah: %d%n",i,y,A[i][y]);
        }
        
    }
    
 }
    
}    
