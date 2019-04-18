public class TicketMachine
{
    private int price; //Harga tiket
    private int balance; //Jumlah uang yang dimasukkan oleh pembeli
    private int total; //Jumlah uang yang dikumpulkan oleh mesin
 
    public TicketMachine (int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }
 
    public int getPrice()
    {
        return price;
    }
 
    public int getBalance()
    {
        return balance;
    }
 
    public void insertMoney (int amount)
    {
        balance = balance + amount;
    }
 
    public void printTicket()
    {
        //Mensimulasikan print tiket
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
 
        //Mengupdate total dengan balance
        total = total + balance;
        //Mengembalikan nilai balance menjadi 0
        balance = 0;
    }
}