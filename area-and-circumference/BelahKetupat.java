
/**
 * BelahKetupat.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;

public class BelahKetupat
{
    public static void main(String []args)
    {
        int diagonal1,diagonal2,keliling,luas,sisi;
        Scanner S=new Scanner (System.in);
        
        System.out.print("Masukkan Diagonal-1 : ");
        diagonal1=S.nextInt();
        
        System.out.print("Masukkan Diagonal-2 : ");
        diagonal2=S.nextInt();
        
        System.out.print("Masukkan Sisi : ");
        sisi=S.nextInt();
        
        luas=(diagonal1*diagonal2)/2;
        System.out.println("Luas Belah Ketupat = "+luas);
        
        keliling=(4*sisi);
        System.out.println("Keliling Belah Ketupat = "+keliling);
    }
}