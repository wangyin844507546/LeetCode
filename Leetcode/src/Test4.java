import java.util.Scanner;

/**
 * @author Wang Yin
 * @date 2020/11/10 16:41
 */
public class Test4 {

//    48*((70-65)-43)+8*1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str2 = in.next();
//        String str = "aaa";
//        String str2 = ".*";
        if (str == null || str2 == null)
            System.out.println("NO");

        if (str.matches(str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
