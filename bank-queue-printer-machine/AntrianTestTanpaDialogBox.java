
/**
 * AntrianTest.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Scanner;

public class AntrianTestTanpaDialogBox
{
    public static int main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        Teller struktel = new Teller();
        CustomerServ strukcs = new CustomerServ();
        int menu;
        
        while(true)
        {
            System.out.println("PILIHAN LAYANAN:");
            System.out.println("1. Teller");
            System.out.println("2. Customer Service");
            System.out.println("3. Exit\n");
            System.out.println("Pilihan Anda: ");
            menu=scan.nextInt();
            switch(menu)
            {
                case 1:
                System.out.println("\n");
                struktel.printStrukTel();
                break;
               
                case 2:
                System.out.println("\n");
                strukcs.printStrukCS();
                break;
               
                case 3:
                return 0;
            }
        }
    }
}