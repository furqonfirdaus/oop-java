
/**
 * Buku.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

public class Buku
{
   String judul;
   String namaPengarang;
   String namaPenerbit;
   String isbn;
   int jumlahHal;
   
   void inputData (String a, String b, String c, String d, int e)
   {
       judul=a;
       namaPengarang=b;
       namaPenerbit=c;
       isbn=d;
       jumlahHal=e;
   }
   void cetak()
   {
       System.out.println("Judul Buku       = "+judul);
       System.out.println("Nama Pengarang   = "+namaPengarang);
       System.out.println("Nama Penerbit    = "+namaPenerbit);
       System.out.println("ISBN             = "+isbn);
       System.out.println("Jumlah Halaman   = "+jumlahHal);
   }
   public static void main(String[] args)
   {
       Buku x = new Buku();
       x.inputData("Merayakan Kehilangan", "Brian Khrisna", "MediaKita",
       "9797945278", 224);
       x.cetak();
    }
}


