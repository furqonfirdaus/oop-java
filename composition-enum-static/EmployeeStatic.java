
/**
 * 8.12 EmployeeStatic.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

public class EmployeeStatic
{
   private String firstName;  
   private String lastName;  
   private static int count = 0; //number of Employees created  
 
   public EmployeeStatic (String first, String last)  
   {  
     firstName=first;  
     lastName=last;  
     ++count; //increment static count of employees
     System.out.printf( "Employee constructor: %s %s; count = %d\n",  
       firstName, lastName, count);  
   }  
   public String getFirstName()  
   {  
     return firstName;  
   }  
   public String getLastName()  
   {  
     return lastName;  
   }  
   public static int getCount()  
   {  
     return count;  
   }
} //end class Employee
