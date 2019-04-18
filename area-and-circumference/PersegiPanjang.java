
/**
 * PersegiPanjang.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;
 
public class PersegiPanjang
{
    public static void main(String[] args)
    {
        int panjang, lebar, luas, keliling;
        
        Scanner S = new Scanner (System.in);
        System.out.print("Masukkan panjangnnya : ");
        panjang=S.nextInt();
        
        System.out.print("Masukkan lebarnya : ");
        lebar=S.nextInt();
       
        luas=(panjang*lebar);
        System.out.println("Luas persegi panjang adalah : "+luas);
       
        keliling=2*(panjang+lebar);
        System.out.println("Keliling persegi panjang adalah : "+keliling);
    }
}