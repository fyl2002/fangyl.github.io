

public class StringBuffer01 {
    public static void main(String[] args) {

        java.lang.String a = "wdw";
        StringBuffer stringBuffer = new StringBuffer(a);
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer append = stringBuffer1.append(a);
        StringBuffer stringBuffer2 = new StringBuffer("0.0");
        String b = stringBuffer2.toString();
        System.out.println(b);
        String c = new String(stringBuffer2);
        System.out.println(c);

        stringBuffer = stringBuffer.append(",").append("dad");
        System.out.println(stringBuffer);
        stringBuffer = stringBuffer.replace(0,2,"我是你得");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.indexOf("ad"));
        stringBuffer = stringBuffer.insert(1,"你爹");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
    }
}

