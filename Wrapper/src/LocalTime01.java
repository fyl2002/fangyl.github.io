import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalTime01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
//        localTime没有get年月日的方法
//        System.out.println(localTime.getYear());
//        System.out.println(localTime.getDayOfMonth());
        System.out.println(localTime.getMinute());
        //格式变化
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = dtf.format(localDate);
        System.out.println(format);

        //Instant
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        System.out.println(date);
    }
}
