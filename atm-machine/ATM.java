/**  
  * ATM.java  
  *  
  * @author Hafara Firdausi/ 5115100043
  * @version 01
  */ 

public class ATM
{
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;
   
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
   
    public ATM()
    {
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSlot = new DepositSlot();
        bankDatabase = new BankDatabase();
    }
  
    public void run()
    {
        while(true)
        {
            while(!userAuthenticated)
            {
                screen.displayMessageLine("\nSelamat Datang!");
                authenticateUser();    
            }  
            performTransactions();      
            userAuthenticated = false;  
            currentAccountNumber = 0;  
            screen.displayMessageLine("\nTerima Kasih!\nSampai Jumpa!");
        }
    }
 
    private void authenticateUser()
    {
        screen.displayMessage("\nSilahkan masukkan nomor akun anda : ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\nSilahkan masukkan PIN anda : ");
        int pin = keypad.getInput();
       
        userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);
       
        if(userAuthenticated)
        {
            currentAccountNumber = accountNumber;  
        }
        else
        {
            screen.displayMessageLine("Nomor akun atau PIN anda tidak valid.");
            screen.displayMessageLine("Silahkan coba lagi.");
        }
    }
 
    private void performTransactions()
    {
        Transaction currentTransaction = null;
        boolean userExited = false;  
       
        while(!userExited)
        {
            int mainMenuSelection = displayMainMenu();
 
            switch(mainMenuSelection)
            {
                case BALANCE_INQUIRY :
                case WITHDRAWAL :
                case DEPOSIT :
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;
                case EXIT :
                    screen.displayMessageLine("\nKeluar dari sistem...");
                    userExited = true;    
                    break;
                default :
                    screen.displayMessageLine("\nMenu yang anda pilih tidak valid.");
                    screen.displayMessageLine("Silahkan coba lagi.");
                    break;
            }  
        }
    }  
 
    private int displayMainMenu()
    {
        screen.displayMessageLine("\nMain Menu :");
        screen.displayMessageLine("1. Lihat Saldo");
        screen.displayMessageLine("2. Tarik Uang");
        screen.displayMessageLine("3. Simpan Uang");
        screen.displayMessageLine("4. Keluar\n");
        screen.displayMessage("Masukkan pilihan : ");
        return keypad.getInput();
    }
   
    private Transaction createTransaction(int type)
    {
        Transaction temp = null;      
        switch(type){
            case BALANCE_INQUIRY :
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL :
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT :
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }  
        return temp;  
    }  
}