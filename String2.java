package pertemuan2;

/*
Nama :la ode ian 
Nim  :3420210002
Prodi:Teknik Informatika
 */
public class String2 {

    public static void main(String[] args) {
       char[] Kucing_Array = {'M','I','L', 'O',};
       String Kucing = new String(Kucing_Array);
       System.out.print("Nama Kucing adalah ");
       System.out.print(Kucing);
       System.out.println(" Terdiri dari:");
       for (int i=0;i<4;i++){
           System.out.println(Kucing_Array[i]);
       }
               
    }    
}
