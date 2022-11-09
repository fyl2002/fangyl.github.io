import java.util.Scanner;
//编写程序，输入人名形式fang yu le，返回le,yu.F

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "wjd wd wad";
        Homework02 homework02 = new Homework02();
        homework02.name_return(name);
    }
    public void name_return(String name){

        String arr[] = name.split(" ");

        char change = arr[0].charAt(0);
        String change1 = change + "";
        change1 = change1.toUpperCase();
        System.out.println(arr[2].concat(",").concat(arr[1]).concat(".").concat(change1));




//        String store = "";
//        char[] arr = name.toCharArray();
//        for (int i = 0; i < name.length(); i++) {
//            if (arr[i] != ' '){//有空格
//                store = arr[i] + "";
//            }
//            if (arr[i] == ' '){
//
//            }
//
//        }
    }
}
