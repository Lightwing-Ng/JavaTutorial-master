import java.util.*;
import java.text.*;

public class DateTime {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date.toString());
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
