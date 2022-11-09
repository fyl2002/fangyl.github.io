import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
    //输入用户名，密码邮箱，如果信息录入正确，则显示注册成功，否则生成异常
    //要求用户名为2-4
    //密码为6 纯数字
    //邮箱包含@和.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int number = scanner.nextInt();
        String mail = scanner.next();
        Homework01 homework01 = new Homework01();
        if (homework01.users(name,number,mail)){
            System.out.println("生成成功");
        }else{
            System.out.println("gg");
        }
    }

    public boolean users(String name, int number, String mail) {
        if (name_(name) && number_(number) && mail_(mail)) {
            return true;
        }return false;
    }

    public boolean name_(String name) {
        if(name.length() < 5 && name.length() > 1) {
            return true;
        }throw new RuntimeException("长度不对");
//        return false;
    }

    public boolean number_(int number) {
        if (number > 99999 && number < 1000000) {
            return true;
//        }throw new RuntimeException("不为六位数");

        }throw new InputMismatchException("不为六位数");
    }

    public boolean mail_(String mail){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = stringBuffer.append(mail);//用indexof方法
        int a = stringBuffer.indexOf("@");
        int b = stringBuffer.indexOf(".");
        if(a != -1 && b != -1 && b > a) {
            return true;

        }return false;

    }
}
