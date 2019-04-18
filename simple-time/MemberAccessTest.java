/**  
 * Program Kelas MemberAccessTest  
 * Anggota kelas private Time1 tidak dapat diakses  
 * Nama file : MemberAccessTest.java  
 */  
   
public class MemberAccessTest
{
   public static void main(String[] args)
   {
       Time1 time = new Time1();
       
       time.hour = 7; //error: has private access
       time.minute = 15; //error: has private access
       time.second = 30; //error: has private access
   }
}