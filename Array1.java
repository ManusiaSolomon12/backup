package pertemuan3;
/*
Nama : La ode ian 
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class Array1 {  
    public static void main(String[] args) {
        //Deklarasi sebuah array integer
int[] Bil;
//Alokasi maksimal array
Bil = new int[10];
//Pemberian nilai array
Bil[0] = 9;
Bil[1] = 2;
Bil[2] = 67;
Bil[3] = 23;
Bil[4] = 17;
Bil[5] = 3;
Bil[6] = 21;
Bil[7] = 89;
Bil[8] = 66;
Bil[9] = 11;

//Mencetak array dengan menggunakan perulangan
int i;
System.out.println(" Program Array");
System.out.println(" ==============================");
for (i=0;i<=9;i++) {
System.out.printf("Nilai bilangan ke-%d adalah: %d %n", i, Bil[i]);
    }
  }
}
