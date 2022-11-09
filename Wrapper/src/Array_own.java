import java.util.Arrays;
import java.util.Comparator;
@SuppressWarnings({"all"})
public class Array_own {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,6,4};
//        bubble01(arr);
//        System.out.println(Arrays.toString(arr));
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;//return后是关键
            }
        });
        System.out.println(Arrays.toString(arr));


        }

    public static void bubble01(int arr[]) {//初始冒泡排序
        int temp = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void bubble02(int[] arr, Comparator comparator){//重写Comparator的
        // compare方法
        int temp1 = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comparator.compare(arr[j],arr[j+1]) > 0 ){
                    temp1 = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp1;
                }

            }
        }
    }

}

