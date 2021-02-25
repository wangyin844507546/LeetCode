import java.util.*;

/**
 * @author Wang Yin
 * @date 2020/11/10 17:19
 */
public class Test10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        str.add(in.next());
        str.add(in.next());
        str.add(in.next());
        str.add(in.next());
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        map.put("6",6);
        map.put("7",7);
        map.put("8",8);
        map.put("9",9);
        map.put("10",10);
        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        if (str.contains("joker") || str.contains("JOKER"))
            System.out.println("ERROR");
        System.out.println("NONE");

    }
}
