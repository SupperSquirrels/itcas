package System类;

public class Demo1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        long startime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("消耗多少毫秒："+(endTime-startime));
    }
}
