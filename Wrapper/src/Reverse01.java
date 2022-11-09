import java.util.Scanner;

public class Reverse01 {
    public static void main(String[] args) {
        //将字符串特定部分进行反转，编写方法public static String reverse（String str，int start，int end）
        Scanner scanner = new Scanner(System.in);
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        String str = scanner.next();
        int start = 1;
        int end = 4;
        String str = "123456";
        System.out.println(reverse1(str,start,end));

    }

    public static String reverse(String str, int start, int end) {
        char[] char1 = str.toCharArray();
        char temp = ' ';
        for (int i = start,j = end ; i < j ; i++,j--) {
            temp = char1[i];
            char1[i] = char1[j];
            char1[j] = temp;

        }String str1 = new String(char1);
        return str1;
    }

    public static String reverse1(String str, int start, int end) {
        String new_str = str.substring(start,end+1);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = stringBuffer.append(new_str);//String 转为Stringbuffer
        stringBuffer = stringBuffer.reverse();//反转
        String b = stringBuffer.toString();
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        stringBuffer1 = stringBuffer1.replace(start,end+1,b);
        String c = stringBuffer1.toString();
        return c;
    }

}
//        String new_str = str.substring(start,end+1);//提取部分 string
//        StringBuffer stringBuffer = new StringBuffer();
//        StringBuffer stringBuffer1 = stringBuffer.append(new_str);//转为stringbuffer
//        StringBuffer stringBuffer2 = stringBuffer1.reverse();//反转
//        StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2);
//        String b = stringBuffer3.toString();
//        StringBuffer stringBuffer4 = new StringBuffer();//转str
//        stringBuffer4.replace(start,end,b);
//        String c = stringBuffer4.toString();
//






