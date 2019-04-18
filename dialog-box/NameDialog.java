
/**
 * NameDialog.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import javax.swing.JOptionPane;
 
public class NameDialog
{
   public static void main (String[] args)
   {
       String name = JOptionPane.showInputDialog ("Halo, Siapa namamu?");
       String message = String.format ("Selamat datang, %s!", name);
       
       JOptionPane.showMessageDialog (null, message);
   }
}