import java.util.Scanner;
//把一个整数/小数每隔三位加一个逗号
public class StringBuffer_Homework {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
        String number = scanner.next();

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
//        stringBuffer = stringBuffer.append(name);
        stringBuffer1 = stringBuffer1.append(number);

        if (stringBuffer1.indexOf(".") == -1) {
            //假如没小数点 1,102,931
            for (int i = 0; i < (stringBuffer1.length() - 1 - i) / 3 ; i++) {
                stringBuffer1.insert(((stringBuffer1.length() - i) - (3 * (i + 1))), ",");
            }
            System.out.println(stringBuffer1);
        } else {//11112222.225
            int a = stringBuffer1.indexOf(".");
            for (int i = 0; i < (a) / 3 ; i++) {
                stringBuffer1.insert(((a) - (3 * (i + 1))), ",");
            }
//            System.out.println(a);
            System.out.println(stringBuffer1);
        }

        }
    }
