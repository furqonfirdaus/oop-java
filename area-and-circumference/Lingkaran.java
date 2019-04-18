
/**
 * Lingkaran.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;
 
public class Lingkaran
{
   public static void main(String[] args)
   {
       double phi=3.14, r, luas, keliling;
       Scanner I = new Scanner (System.in);
       
       System.out.print("Masukkan jari-jari lingkarannya : ");
       r=I.nextInt();
       
       luas=phi*r*r;
       System.out.println("Luas lingkaran adalah : "+luas);
       
       keliling=2*phi*r;
       System.out.println("Keliling lingkaran adalah : "+keliling);
   }
}