import java.util.Arrays;

public class suiyi {
    public static void main(String[] args) {
        String a = "aa,bb";
        String b[] = a.split(",");
        System.out.println(Arrays.toString(b));
        System.out.println(b[1]);
    }
}
