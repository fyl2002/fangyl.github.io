import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt01 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1234566611111111113131313136");
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger("1000");
        BigInteger bigInteger2 = bigInteger.add(bigInteger1);
        System.out.println(bigInteger2);
//        BigInteger bigInteger3 = bigInteger.divide(bigInteger1);
//        System.out.println(bigInteger3);
        BigDecimal bigDecimal = new BigDecimal("13.33333333333333333333333333");
        BigDecimal bigDecimal1 = new BigDecimal("1.9");
        BigDecimal bigDecimal2 = bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING);
        System.out.println(bigDecimal2);

    }
}
