/**  
  * BankDatabase.java  
  *  
  * @author Hafara Firdausi/ 5115100043
  * @version 01  
  */
 
public class BankDatabase
{
    private Account[] accounts;
    
    public BankDatabase()
    {
        accounts = new Account[2];
        accounts[0] = new Account(12345, 54321, 1000000, 1200000);
        accounts[1] = new Account(98765, 56789, 200000, 200000);
    }
    
    private Account getAccount(int accountNumber)
    {
        for(Account currentAccount : accounts)
        {
            if(currentAccount.getAccountNumber() == accountNumber)
                return currentAccount;
        }
        return null;
    }
    
    public boolean authenticateUser(int userAccountNumber, int userPIN)
    {
        Account userAccount = getAccount(userAccountNumber);
        if(userAccount != null)
            return userAccount.validatePIN(userPIN);
        else
            return false;
    }
    
    public double getAvailableBalance(int userAccountNumber)
    {
        return getAccount(userAccountNumber).getAvailableBalance();
    }
    
    public double getTotalBalance(int userAccountNumber)
    {
        return getAccount(userAccountNumber).getTotalBalance();
    }
    
    public void credit(int userAccountNumber, double amount)
    {
        getAccount(userAccountNumber).credit(amount);
    }
    
    public void debit(int userAccountNumber, double amount)
    {
        getAccount(userAccountNumber).debit(amount);
    }
}