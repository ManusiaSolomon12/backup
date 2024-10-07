package pertemuan2;

/*
Nama :la ode ian 
Nim  :3420210002
Prodi:Teknik Informatika
 */
public class Regex1 {

    public static void main(String[] args) {
        //Mendefinisikan Variable 
        String Nama = "La ode ian";
        
        //Mencocokan Nilai
        boolean Nilai1 = Nama.matches("La ode ian");
        boolean Nilai2 = Nama.matches( "La ode ianPratama");
        
        //Menampilkan Hasil 
        System.out.println("Hasil Pertama : " + Nilai1);
        System.out.println("Hasil Kedua   : " + Nilai2);
    }
    
}
