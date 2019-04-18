/**  
  * CashDispenser.java  
  *  
  * @author Hafara Firdausi/ 5115100043
  * @version (a version number or a date)  
  */ 
 
public class CashDispenser
{
    private final static int INITIAL_COUNT = 1000000;
    private int count;
    
    public CashDispenser()
    {
        count = INITIAL_COUNT;
    }
    
    public void dispenseCash(int amount)
    {
        int billsRequired = amount / 20;
        count -= billsRequired;
    }
    
    public boolean isSufficientCashAvailable(int amount)
    {
        int billsRequired = amount / 20;
        if(count >= billsRequired)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}  