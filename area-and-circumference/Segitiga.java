
/**
 * Segitiga.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;
 
public class Segitiga
{
    public static void main(String[] args)
    {
        int sisimiring1, sisimiring2, alas, tinggi, luas, keliling;
       
        Scanner F=new Scanner(System.in);
        System.out.print("Masukkan alasnya : ");
        alas=F.nextInt();
       
        System.out.print("Masukkan tingginya : ");
        tinggi=F.nextInt();
       
        System.out.print("Masukkan sisi miring 1 : ");
        sisimiring1=F.nextInt();
       
        System.out.print("Masukkan sisi miring 2 : ");
        sisimiring2=F.nextInt();
       
        luas=(alas*tinggi)/2;
        System.out.println("Luas segitiga adalah : "+luas);
       
        keliling=alas+sisimiring1+sisimiring2;
        System.out.println("Keliling segitiga adalah : "+keliling);
    }
}