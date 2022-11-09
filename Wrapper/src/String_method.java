public class String_method {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        String A = "1";
        String B = "3";
        String C = "abcacae";
        String D = "acdf,adac";
        System.out.println(A.equalsIgnoreCase(B));
        System.out.println(C.indexOf("w"));
        System.out.println(C.substring(1,4));
        System.out.println(C.charAt(2));
        System.out.println(C.toUpperCase());
        System.out.println(C.concat(A).concat(B));
        System.out.println(C.replace("c","w"));
        C.replace("c","w");
        System.out.println(C);
        String[] split = D.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        char[] arr1 = C.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(A.compareTo(B));
        System.out.println(C.toCharArray() );
        String name = "dwg";
        int age = 11;
        double number = 17.8898;
        String info = String.format("我的名字是%s，年龄为%d，成绩是%.2f",name,age,number);
        System.out.println(info);
        int a = 7;
        int b = 3;
        int c = a / b ;
        System.out.println(c);
    }

}
