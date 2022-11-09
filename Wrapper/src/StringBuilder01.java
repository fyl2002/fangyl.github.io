public class StringBuilder01 {
    public static void main(String[] args) {
        long starttime = 0l;
        long stoptime = 0l;
        StringBuilder stringBuilder = new StringBuilder("");
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        stoptime = System.currentTimeMillis();
        System.out.println("builder " + (stoptime - starttime));

        StringBuffer stringBuffer = new StringBuffer("");
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        stoptime = System.currentTimeMillis();
        System.out.println("buffer " + (stoptime - starttime));

        String string = "";
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            string = string + i;
        }
        stoptime = System.currentTimeMillis();
        System.out.println("string " + (stoptime - starttime));
    }
}
