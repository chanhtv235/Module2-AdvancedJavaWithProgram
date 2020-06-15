import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    private String date=null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NextDayCalculator() {
    }

    public NextDayCalculator(String date) {
        this.date = date;
    }

    public  String returnNexDay(){
        Date date1 = new Date("01/02/1970 17:00:00");
         Date date =new Date(this.date);
         date.setTime(date.getTime()+date1.getTime());
        DateFormat dateFormat =new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(date).toString();
    }

    public static void main(String[] args) {
        NextDayCalculator nextDayCalculator =new NextDayCalculator("6/3/2018");
        System.out.println(nextDayCalculator.returnNexDay());
    }
}
