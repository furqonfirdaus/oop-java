/**  
  * BalanceInquiry.java  
  *  
  * @author Hafara Firdausi/ 5115100043
  * @version 01  
  */  

public class BalanceInquiry extends Transaction
{
    public BalanceInquiry( int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase )
    {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }
   
    @Override
    public void execute()
    {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
       
        double availableBalance = bankDatabase.getAvailableBalance( getAccountNumber());
       
        double totalBalance = bankDatabase.getTotalBalance( getAccountNumber());
       
        screen.displayMessageLine( "\nInformasi Saldo:" );
        screen.displayMessage( " - Saldo yang Tersedia: ");
        screen.displayRupiahAmount( availableBalance );
        screen.displayMessage( "\n - Saldo Total: ");
        screen.displayRupiahAmount( totalBalance );
        screen.displayMessageLine("");
    }
}
