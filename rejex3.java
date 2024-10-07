package pertemuan3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Nama : La ode ian 
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class rejex3 {
    public static void main(String[] args) {
        String Telp1 = "082260465121";
        String Telp2 = "08561939419";
        System.out.println("Program pencarian nomor Simpati");
        System.out.println("Telp 1:"+ Telp1);
        System.out.println("Telp 2:"+ Telp2);
        String Pola = "^0812";
        Pattern r;
        r = Pattern.compile(Pola);
        Matcher x;
        System.out.println("pencocokan Telp 1");
        x = r.matcher(Telp1);
        if (x.find()) {
            System.out.println("Nomor telp cocok");
        }else {
            System.out.println("Nomor telp tidak cocok");
        }
        System.out.println("pencocokan Telp 2");
        x = r.matcher(Telp2);
        if (x.find()) {
            System.out.println("Nomor telp cocok");
        } else {
            System.out.println("Nomor telp tidak cocok");
        }
    }
    
}
