public class String01 {
    String str = new String("fyl");
    final char[] ch = {'j','a','v','a'};
    public void change(String str , char ch[]) {
        str = "java";//3 str本身通过构造器构成，指向堆，堆中有地址指向常量池，这里指形参变为java
                        //相当于新建了一个指向常量池的变量
        ch[0] = 'h';//final类型不能指向新的地址，可以改变值的内容

    }
    public static void main(String[] args) {
        String01 ex = new String01();//1创建对象
        ex.change(ex.str, ex.ch);//2调用方法，传入参数为fyl和j a v a，回到change方法
        System.out.print(ex.str + "and");
        System.out.println(ex.ch);
    }


}

