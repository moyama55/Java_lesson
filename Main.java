import java.util.Calender;
import java.util.Date;


public class Main{
    public static void main(String[] args) throws Exception{
        Date d = new Date();
        Calender c = Calender.getInstance();
        c.setTime(d);
        int day = c.get(Calender.DAY_OF_MONTH);
        day += 100;
        c.set(Calender.DAY_OF_MONTH, day);
        Date a = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s = f.format(a);
    }
}
