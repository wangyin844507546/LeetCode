import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Wang Yin
 * @date 2020/11/10 15:55
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int a = 0;
        String [] ans = new String[length];
        while (in.hasNext()) {
            String str = in.next();
            try{
                String[] arr = new String[] {"1","0","X","9","8","7","6","5","4","3","2"};
                int[] key = new int[] {7,9,10,5,8,4,2,1,6,3,79,10,5,8,4,2};
                int sum = 0;
                for (int i = 0 ; i < key.length; i++) {
                    sum += key[i] * Integer.valueOf(String.valueOf(str.charAt(i)));
                }
                if (!String.valueOf(Math.floorMod(sum,11)).equals(String.valueOf(str.charAt(str.length() - 1))))
                {
                    System.out.println(str);
                    a++;
                }
            } catch (Exception e) {
                System.out.println(str);
                a++;
            }

        }
        if (a == 0) {
            System.out.println("All passed");
        }
    }
}
