package pertemuan4;

/*
Nama : la ode ian
Nim  : 3420210002
Prodi: Teknik Informatika
 */
public class fungsi1 {

    public static void main(String[] args) {
        
        int alas = 10;
        garis();
        System.out.println(" Program menghitung segitiga"); int tinggi = 5;
        garis();
        double luas;
        System.out.print("Alas segitiga: " + alas + "\n");
        System.out.print("Tinggi segitiga: " + tinggi + "\n");
        luas = (alas * tinggi) * 0.5;
        System.out.printf("Luas segitiga adalah: %.2f cm \n",luas);
    }
    
    //Ini adalah prosedur garis
    public static void garis(){
        System.out.println("==================================");
    }
    
}
