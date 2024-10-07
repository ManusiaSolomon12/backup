package pertemuan3;

/*
Nama : La ode ian 
Nim  : 3420210002
Prodi: Teknik Informatika
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex5 {
    
    /*
    susunan regex di atur pada fungsi Pattern yaitu
        ^[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$
    dengan penjelasan:
    - Aturan pertama adalah tanda ^ yaitu tanda pembuka 
    -aturan kedua adalah azA-Z0-9_1 merupakan aturan nama email yang bisa 
        dituliskan mulai a-z dengan huruf kecil ataupun kapital serta angka 0-9
        dan juga bisa dituliskan dengan menggabungkan karakter "_" dan karakter
        titik "."
    -aturan ketiga adalah karakter "@" merupakan sturan utama dari panulisan 
        email, sehingga setelah penulisan nama email harus diikuti oleh karakter "@"
    -aturan kempat adalah [a-zA-z0-9] merupakan nama provider yang dapat 
        dituliskan mulai a-a dengan huruf kecil ataupun huruf kapital serta angka 0-9
    -aturan kelima adalah tanda titik "." yang merupakan tanda setelah nama 
        provider yang dituliskan sebelum aturan keenam. 
    -aturan keenam adalah [a-zA-Z0-9] merupakan aturan untuk penulisan
        akhiran dari provider, biasanya .com, .net dan lain-lain.
    -aturan ketujuh adalah karakter "$" adalah tanda penutup dari aturan regex 
        pada java.
*/

    public static void main(String[] args) {
         String Emaill = "laode21@gmail.com";
        System.out.println("Email adalah: " + Emaill);
        Pattern POLA = Pattern.compile("^[A-Za-z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher Cocok = POLA.matcher(Emaill);
        int i = 0;
        while (Cocok.find()){ i = Cocok.start() + 1;}
        if (i==0) { System.out.println("Komposisi email salah"); } 
        else { System.out.println("Komposisi email benar."); }
    }
}
