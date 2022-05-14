package conversisuhu;
import java.util.Scanner;
/**
 *
 * @author 20103295 Ni Putu Eka Sepiantini
 */
public class ConversiSuhu {

    public static void main(String[] args) {
        float C = 0, F = 0;
        int pilih, pilihku;
       
        Scanner scan = new Scanner(System.in);
        Suhu konversi = new Suhu();
        System.out.print("Pilih Menu Konversi Suhu Berikut ini : "
                + "\n1. Celcius"
                + "\n2. Fahrenheit"
                + "\n:");
        pilih = scan.nextInt();
        
        switch(pilih){
            
            case 1:
                System.out.print("Pilih konversi dari Celcius ke - "
                     + "\n1. Fahrenheit"
                     + "\n:");
                
                pilihku = scan.nextInt();
                
                if (pilihku == 1 ){
                    konversi.celciuskefahrenheit(C, F);
                } else
                    System.out.println("pilihan anda salah");
                
                break;
                
            case 2 :
                 System.out.print("Pilih konversi dari Fahrenheit ke"
                        
                        + "\n1. Celcius"
                        + "\n:");
                 pilihku = scan.nextInt();
                 
                 if (pilihku == 1){
                     konversi.fahrenheitkecelcius(F, C);
                 } else
                break;
            
               
            default : System.out.println("Konversi suhu yang di masukan tidak tersedia");
        
        }     
    }
}
       
