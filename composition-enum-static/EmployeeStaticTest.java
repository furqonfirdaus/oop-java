
/**
 * 8.12 EmployeeStaticTest.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

public class EmployeeStaticTest
{
   public static void main(String[] args)  
   {  
      //show that count is 0 before creating Employees
     System.out.printf("Employees before instantiation: %d\n", EmployeeStatic.getCount() );  
     
     EmployeeStatic e1 = new EmployeeStatic("Susan", "Baker");  
     EmployeeStatic e2 = new EmployeeStatic("Bob", "Blue");  
     
     System.out.println("\nEmployees after instantiation: ");  
     System.out.printf("via e1.getCount(): %d\n", e1.getCount());  
     System.out.printf("via e2.getCount(): %d\n", e2.getCount());  
     System.out.printf("via EmployeeStatic.getCount(): %d\n", EmployeeStatic.getCount());  
      // get names of Employees
     System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",  
       e1.getFirstName(), e1.getLastName(),  
       e2.getFirstName(), e2.getLastName());  
     e1 = null;  
     e2 = null;  
   }
} //end class EmployeeTest
