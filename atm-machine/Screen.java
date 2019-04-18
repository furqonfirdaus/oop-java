 /**  
  * Screen.java  
  *  
  * @author Hafara Firdausi/ 5115100043  
  * @version 01
  */  

public class Screen  
{
    public void displayMessage(String message)
    {
        System.out.print(message);
    }
    
    public void displayMessageLine(String message)
    {
        System.out.println(message);
    }
    
    public void displayRupiahAmount(double amount)
    {
        System.out.printf("Rp%,.2f", amount);
    }
}