
/**
 * CustomerServ.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import javax.swing.JOptionPane;

public class CustomerServ
{
    Waktu wkt = new Waktu();
    public int totalAntrianCS = 1;
    public int tampilCS = 1;
       
    public void printStrukCS() //Untuk yang tidak pake DialogBox
    {
        //simulate the printing of a ticket
        System.out.println("----------------------------------------");
        System.out.println("              BANK HAFARA              ");
        System.out.println("\n");
        System.out.println("          Nomor antrian anda:         ");
        System.out.println("                  B" + totalAntrianCS++);
        System.out.println("        Sedang menunggu " + (totalAntrianCS-2) + " orang");
        System.out.println("\n");
        System.out.println("         "+wkt.getTanggal());
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN JASA KAMI");
        System.out.println("----------------------------------------");
        System.out.println("\n");
    }
    
    public int jmlAntrian(int a)
    {
        totalAntrianCS = a;
        return totalAntrianCS;
    }
    
    public int tampil(int a)
    {
        tampilCS = a;
        return tampilCS;
    }
    
    public void printStruk()
    {
        String message1 = String.format("-------------------------------------------\n               BANK HAFARA\n\n          Nomor antrian anda:\n          CUSTOMER SERVICE\n                          B%d\n\n  Sedang menunggu %d ORANG\n"+"          "+wkt.getTanggal()+"\n\n        TERIMA KASIH TELAH\n   MENGGUNAKAN JASA KAMI\n-------------------------------------------", tampilCS, totalAntrianCS-1);
        JOptionPane.showMessageDialog(null, message1);
        tampilCS++;
    }
}