import java.util.Scanner;

/**
 * @author Wang Yin
 * @date 2020/11/10 17:01
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int max = 0;
        for (int i = 0; i < a.length() - 3; i++) {
            if (a.charAt(i) == a.charAt(i+2)) {
                max =  Math.max(max,getHuiWen(a,i+1));
            }
        }
        System.out.println(2 * max + 1);
    }

    private static int getHuiWen(String a, int i) {
        int k = 1;
        int len = 0;
        while (a.charAt(i - k) == a.charAt(i + k)){
            len++;
            k++;
            if ( i - k < 0 || i + k > a.length())
                return len;
        }
        return len;
    }


}
