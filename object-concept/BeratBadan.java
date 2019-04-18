
/**
 * BeratBadan.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;

public class BeratBadan
{
    public static void main (String []args)
    {
        int jenisKelamin;
        double bmi, berat, tinggi;
        Scanner masukan =new Scanner (System.in);
        
        System.out.println("PROGRAM PENGHITUNG BERAT BADAN IDEAL DENGAN RUMUS BMI");
        System.out.println("Apa jenis kelamin anda?");
        System.out.println("1. Perempuan");
        System.out.println("2. Laki-laki");
        jenisKelamin = masukan.nextInt();
        
        System.out.println("Berat (kg): ");
        berat = masukan.nextInt();
        System.out.println("Tinggi (cm):");
        tinggi = masukan.nextInt();
        tinggi = tinggi/100;
        
        bmi=(double)(berat/(tinggi*tinggi));
        System.out.println("BMI anda "+bmi);
        
        if(jenisKelamin==1)
        {
            if (bmi<18) System.out.println("Anda kurus");
            else if (bmi>18 && bmi<=25) System.out.println("Anda Normal");
            else if (bmi>=25 && bmi <27) System.out.println("Anda Kegemukan");
            else if (bmi>=27) System.out.println("Anda Obesitas");
        }
        
        else if(jenisKelamin==2)
        {
            if (bmi<17) System.out.println("Anda kurus");
            else if (bmi>17 && bmi<=23) System.out.println("Anda Normal");
            else if (bmi>=23 && bmi <27) System.out.println("Anda Kegemukan");
            else if (bmi>=27) System.out.println("Anda Obesitas");
        }
    }
}