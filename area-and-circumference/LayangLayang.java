
/**
 * LayangLayang.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;

public class LayangLayang
{
    public static void main (String[] args)
    {
        Scanner nilai = new Scanner (System.in);
        double keliling, luas;
        
        System.out.println("Menghitung Luas Layang-Layang");
        {
            int d1, d2;
            System.out.println("Diagonal 1 : ");
            d1 = nilai.nextInt();
            System.out.println("Diagonal 2 : ");
            d2 = nilai.nextInt();
            luas = d1*d2/2;
            System.out.println("Luas layang-layang : "+luas);
        }
        System.out.println("\nMenghitung Keliling Layang-Layang");
        {
            int sisiA, sisiB;
            System.out.println("Sisi A : ");
            sisiA = nilai.nextInt();
            System.out.println("Sisi B : ");
            sisiB = nilai.nextInt();
            keliling = 2*sisiA + 2*sisiB;
            System.out.println("Keliling layang-layang : "+keliling);
        }
    }
}