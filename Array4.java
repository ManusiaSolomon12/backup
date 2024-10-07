package pertemuan4;
import java.util.Scanner;
/*
Nama : la ode ian
Nim  : 3420210002
prodi: Teknik Informatika
 */
public class Array4 {

    public static void main(String[] args) {
      System.out.println("--------------------------------");
      System.out.println(" Program UTS");
      System.out.println("--------------------------------");
      System.out.println("Masukan jumlah data:  ");
      Scanner Input = new Scanner(System.in);
      int JmlData_iyan;
      int i_iyan;
      String[] Nama_iyan = new String[10];
      int[] Absen_iyan = new int[10];
      int[] Tugas_iyan = new int[10];
      int[] UTS_iyan = new int[10];
      int[] UAS_iyan = new int[10];
      double[] Total_iyan = new double[10];
      JmlData_iyan = Input.nextInt();
      System.out.println();
      for (i_iyan=1;i_iyan<=JmlData_iyan;i_iyan++){
          System.out.println("Data ke " + i_iyan);
          System.out.print("Nama Mahasiswa: ");
          Nama_iyan[i_iyan] = Input.next();
          System.out.print("Nilai absen   : " );
          Absen_iyan [i_iyan] = Input.nextInt();
          System.out.print("Nilai Tugas   : ");
          Tugas_iyan [i_iyan] = Input.nextInt();
          System.out.print("Nilai UTS     : ");
          UTS_iyan [i_iyan] = Input.nextInt();
          System.out.print("Nilai UAS     : ");
          UAS_iyan[i_iyan] = Input.nextInt();
          //==========================================//
          Total_iyan[i_iyan] = (Absen_iyan[i_iyan] * 0.1) + (Tugas_iyan[i_iyan] * 0.2) +
          (UTS_iyan[i_iyan] * 0.3) + (UAS_iyan[i_iyan] * 0.4);
          //=========================================//
          System.out.println();
      }
      System.out.println();
      System.out.println("---------------------------------------");
      System.out.println("No Nama Absen Tugas UTS UAS Total ");
      System.out.println("---------------------------------------");
      for(i_iyan=1;i_iyan<=JmlData_iyan;i_iyan++){
          System.out.print(i_iyan + " ");
          System.out.print(Nama_iyan[i_iyan] + "  ");
          System.out.print(Absen_iyan[i_iyan] + "   ");
          System.out.print(Tugas_iyan[i_iyan]+ " ");
          System.out.print(UTS_iyan[i_iyan] + " ");
          System.out.print(UAS_iyan[i_iyan] + " ");
          System.out.print(Total_iyan[i_iyan] + "");
          System.out.println();           
        }
        System.out.println("---------------------------------------");
     
    }
    
}
