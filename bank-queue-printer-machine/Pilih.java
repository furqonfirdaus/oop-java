
/**
 * Pilih.Java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import javax.swing.JOptionPane;

public class Pilih
{
    public int totalAntrianTeller = 1;
    public int totalAntrianCS = 1;
    public int tampilTeller = 1;
    public int tampilCS = 1;
    
    
    public void pilihAntri()
    {
        Waktu wkt = new Waktu();
        Teller tel = new Teller();
        CustomerServ cs = new CustomerServ();
        
        String pilihan = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Teller\n 2. Customer Service");
        int menu = Integer.parseInt(pilihan);
        
        switch(menu)
        {
            case 1:
            tel.jmlAntrian(totalAntrianTeller);
            tel.tampil(tampilTeller);
            tel.printStruk();
            totalAntrianTeller++;
            tampilTeller++;
            break;
            
            case 2:
            cs.jmlAntrian(totalAntrianCS);
            cs.tampil(tampilCS);
            cs.printStruk();
            totalAntrianCS++;
            tampilCS++;
            break;
            
            default:
            String message2 = String.format("Maaf, input yang anda masukkan salah. Silahkan coba lagi.");
            JOptionPane.showMessageDialog(null, message2);
            break;
        }
    }
    
    public void pilihHapus()
    {   
        String pilihan = JOptionPane.showInputDialog("Melayani Sebagai:\n 1. Teller\n 2. Customer Service");
        int menu = Integer.parseInt(pilihan);
        
        switch(menu)
        {
            case 1:
            String message0 = String.format("Berhasil mengurangi 1 nasabah pada antrian Teller.\nSisa nasabah : %d orang", totalAntrianTeller-2);
            JOptionPane.showMessageDialog(null, message0);
            totalAntrianTeller--;
            break;
            
            case 2:
            String message1 = String.format("Berhasil mengurangi 1 nasabah pada antrian Customer Service.\nSisa nasabah : %d orang", totalAntrianCS-2);
            JOptionPane.showMessageDialog(null, message1);
            totalAntrianCS--;
            break;
            
            default:
            String message2 = String.format("Maaf, input yang anda masukkan salah. Silahkan coba lagi.");
            JOptionPane.showMessageDialog(null, message2);
            break;
        }
    }
    
}