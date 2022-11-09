public class Integer01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        int a = 100;
        Integer integer = new Integer(a);
        Integer integer1 = Integer.valueOf(a);
//        Integer integer2 = a;
        int n2 = integer;//自动拆箱
        int i = integer.intValue();
//        String
        //value地址不可修改
        final char[] value = {'a','b'};
        value[1] = 'c';
        System.out.println(value);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
