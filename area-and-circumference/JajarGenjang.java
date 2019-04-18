
/**
 * JajarGenjang.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;
 
public class JajarGenjang
{
   public static void main(String[] args)
   {
       int alas, sisimiring, tinggi, luas, keliling;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan alasnya : ");
       alas = input.nextInt();
       
       System.out.println("Masukkan sisi miringnya : ");
       sisimiring = input.nextInt();
       
       System.out.println("Masukkan tingginya : ");
       tinggi = input.nextInt();
       
       luas = alas*tinggi;
       System.out.println("Luas jajar genjang adalah : "+luas);
       
       keliling = (2*alas)+(2*sisimiring);
       System.out.println("Keliling jajar genjang adalah : "+keliling);
    }
}