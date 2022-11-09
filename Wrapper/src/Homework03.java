public class Homework03 {
    public static void main(String[] args) {
        String str = "wdaw313o1nd13o1ndoi1d";
        Homework03 homework03 = new Homework03();
        homework03.countNumber(str);
    }

    //判断字符串有多少个大写小写或数字



    public void countNumber(String str) {
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] <= 'Z' && arr[i] >= 'A') {
                countUpper += 1;
            }if (arr[i] <= 'z' && arr[i] >= 'a') {
                countLower += 1;
            }if (arr[i] <= '9' && arr[i] >= '0') {
                countNum += 1;
            }
        }
        System.out.println("大写" + countUpper + "小写" + countLower + "数字" + countNum);
    }
}
