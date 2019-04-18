
/**
 * Teller.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import javax.swing.JOptionPane;

public class Teller
{
    Waktu wkt = new Waktu();
    public int totalAntrianTeller = 1;
    public int tampilTeller = 1;
 
    public void printStrukTel() //Untuk yang tidak pake DialogBox
    {
        //simulate the printing of a ticket
        System.out.println("----------------------------------------");
        System.out.println("              BANK HAFARA              ");
        System.out.println("\n");
        System.out.println("          Nomor antrian anda:         ");
        System.out.println("                  A" + totalAntrianTeller++);
        System.out.println("        Sedang menunggu " + (totalAntrianTeller-2) + " orang");
        System.out.println("\n");
        System.out.println("         "+wkt.getTanggal());
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN JASA KAMI");
        System.out.println("----------------------------------------");
        System.out.println("\n");
    }
    
    public int jmlAntrian(int a)
    {
        totalAntrianTeller = a;
        return totalAntrianTeller;
    }
    
    public int tampil(int a)
    {
        tampilTeller = a;
        return tampilTeller;
    }
    
    public void printStruk()
    {
        String message0 = String.format("-------------------------------------------\n               BANK HAFARA\n\n          Nomor antrian anda:\n                     TELLER\n                          A%d\n\n  Sedang menunggu %d ORANG\n"+"          "+wkt.getTanggal()+"\n\n        TERIMA KASIH TELAH\n   MENGGUNAKAN JASA KAMI\n-------------------------------------------", tampilTeller, totalAntrianTeller-1);
        JOptionPane.showMessageDialog(null, message0);
    }
}
