import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

    }
}
