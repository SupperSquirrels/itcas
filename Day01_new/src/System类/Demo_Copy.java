package System类;

import java.util.Arrays;

public class Demo_Copy {
    public static void main(String[] args) {
        int[] a = new int[]{10,20,304,05,40};
        int[] b = new  int[5];
        System.out.println(Arrays.toString(b));

        System.arraycopy(a,2,b,0,3);
        System.out.println(Arrays.toString(b));
    }
}
