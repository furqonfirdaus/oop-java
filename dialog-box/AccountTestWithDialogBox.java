
/**
 * AccountTestWithDialogBox.java
 * 
 * @author Hafara Firdausi/ 5115100043
 * @version 01
 */

import javax.swing.JOptionPane;
 
public class AccountTestWithDialogBox
{
   public static void main (String[] args)
   {
       Account account1 = new Account(50.00);
       Account account2 = new Account(-7.53);
 
       String message0 = String.format("Account1 balance: $%.2f\nAccount2 balance: $%.2f", account1.getBalance(), account2.getBalance());
       JOptionPane.showMessageDialog(null, message0);
       
       String depositAmount0 = JOptionPane.showInputDialog("Enter deposit amount for account1: ");
       
       double double1 = Double.parseDouble(depositAmount0);
       account1.credit(double1);
       
       String message1 = String.format("\nAdding %s to account1 balance\n\n", depositAmount0);
       JOptionPane.showMessageDialog(null, message1);
       String message2 = String.format("Account1 balance: $%.2f\nAccount2 balance: $%.2f", account1.getBalance(), account2.getBalance());
       JOptionPane.showMessageDialog(null, message2);
       
       String depositAmount1 = JOptionPane.showInputDialog("Enter deposit amount for account2: ");
       
       double double2 = Double.parseDouble(depositAmount1);
       account2.credit(double2);
       
       String message3 = String.format("\nAdding %s to account2 balance\n\n", depositAmount1);
       JOptionPane.showMessageDialog(null, message3);
       String message4 = String.format("Account1 balance: $%.2f\nAccount2 balance: $%.2f", account1.getBalance(), account2.getBalance());
       JOptionPane.showMessageDialog(null, message4);
   }
}