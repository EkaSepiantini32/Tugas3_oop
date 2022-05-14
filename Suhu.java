package conversisuhu;
import java.util.Scanner;
/**
 *
 * @author 20103295 Ni Putu Eka Sepiantini
 */
public class Suhu {
    Scanner scan = new Scanner(System.in);
   public void celciuskefahrenheit (float C, float F){
       System.out.print("masukan nilai celcius : " );
       C = scan.nextFloat();
       F = (float) (C * 1.8 + 32);
       System.out.println("hasil : " + F);
   }
   
   public void fahrenheitkecelcius (float F, float C){
       System.out.print("masukan nilai fahrenheit : " );
       F = scan.nextFloat();
       C = (float) ((F - 32) / 1.8);
       System.out.println("hasil : " + C);
   }
    void kelvinkecelcius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
