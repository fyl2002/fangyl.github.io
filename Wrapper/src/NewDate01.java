import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewDate01{
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();//获取时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//指定格式
        String format = sdf.format(d1);
        System.out.println(format);

        //可以把一个格式化的String转成对应的date
        String s = "2022-1-1";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
