import java.util.Arrays;

public class System01 {

    public static void main(String[] args) {
        System.out.println("1");
//        System.exit(0);
        System.out.println("2");

        int arr[] = {1,2,3};
        int arr1[] = new int[3];
        System.arraycopy(arr,1,arr1,1,2);
        System.out.println(Arrays.toString(arr1));
        int arr2[] = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(arr2));
    }
}
