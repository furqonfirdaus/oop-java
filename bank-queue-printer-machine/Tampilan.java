
/**
 * Write a description of class Tampilan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class Tampilan
{
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    
    public void Tampil()
    {
        mainFrame = new JFrame("Bank Hafara");
        mainFrame.setSize(300,150);
        mainFrame.setLayout(new GridLayout(3, 1));
        
        mainFrame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
               int result = JOptionPane.showConfirmDialog(null,"Yakin ingin menutup keluar dari aplikasi AntrianBank?", "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
               if (result == JOptionPane.YES_OPTION){
                   System.exit(0);
               }
           }        
       });
        
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350,100);
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);  
    }
    
    public void Pilih()
    {
       Pilih pil = new Pilih();
       
       headerLabel.setText("Selamat Datang di Bank Hafara!");
       
       JButton nas = new JButton("Nasabah"); 
       JButton peg = new JButton("Pegawai"); 
       nas.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               pil.pilihAntri();
           }          
       });
       
       peg.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               pil.pilihHapus();
           }          
       });
       
       controlPanel.add(nas);
       controlPanel.add(peg);
       mainFrame.setVisible(true);  
   }   
}
