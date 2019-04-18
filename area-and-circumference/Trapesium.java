
/**
 * Trapesium.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;

public class Trapesium
{
    public static void main(String[] args)
    {
        int sisisejajar1, sisisejajar2,tinggi,sisimiring1,sisimiring2,luas,keliling;
        Scanner S = new Scanner (System.in);
        
        System.out.print("Masukan Sisi Sejajar-1 : ");
        sisisejajar1=S.nextInt();
        
        System.out.print("Masukan Sisi Sejajar-2 : ");
        sisisejajar2=S.nextInt();
        
        System.out.print("Masukan Tinggi : ");
        tinggi=S.nextInt();
        
        System.out.print("Masukan Sisi Miring-1 : ");
        sisimiring1=S.nextInt();
        
        System.out.print("Masukan Sisi Miring-2 : ");
        sisimiring2=S.nextInt();
        luas=((sisisejajar1+sisisejajar2)*tinggi)/2;
        keliling=sisisejajar1+sisisejajar2+sisimiring1+sisimiring2;
        
        System.out.println("Luas Trapesium = "+luas);
        System.out.println("Keliling Trapesium = "+keliling);
    }
}