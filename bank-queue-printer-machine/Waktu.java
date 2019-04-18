
/**
 * Waktu.java
 * 
 * @author Hafara Firdausi/ 5115100043 
 * @version 01
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Waktu
{
    public String getTanggal()
    {
        DateFormat dateFormat = new SimpleDateFormat("H:mm:ss   dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
