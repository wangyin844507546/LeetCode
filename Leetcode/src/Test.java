import java.math.BigDecimal;
import java.util.*;

/**
 * @author Wang Yin
 * @date 2020/11/10 15:20
 */
public class Test {
//4
//        320124198808240056
//        12010X198901011234
//110108196711301866
//        37070419881216001X

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int length = in.nextInt();
//        int[] ans = new int[length];
//        int i = 0;
//        while (in.hasNext()) {
//            ans[i++] = in.nextInt();
//        }
        Scanner in = new Scanner(System.in);
        BigDecimal  var1 = in.nextBigDecimal();
        BigDecimal  var2 = in.nextBigDecimal();
//        BigDecimal var1 = new BigDecimal("123456");
//        BigDecimal var2 = new BigDecimal("123456");
        BigDecimal var3 = var1.multiply(var2);
        System.out.println(var3);

    }


//        int[] ans = new int[] {1,1,3,2,4,5};
//        List<Integer>  list = new ArrayList<>();
//        Map<String,Integer> map = new HashMap<>();
//        for(int k = 0; k < ans.length; k ++){
//            if (map.containsKey(String.valueOf(ans[k])))
//                map.put(String.valueOf(ans[k]),map.get(String.valueOf(ans[k])) + 1);
//            else
//                map.put(String.valueOf(ans[k]),1);
//        }
//        for (Map.Entry<String,Integer> entry: map.entrySet()) {
//                int value = entry.getValue();
//                if (value % 2 != 0)
//                    list.add(Integer.valueOf(entry.getKey()));
//        }
//        Collections.sort(list);
//        for (Integer integer:list){
//            System.out.print(integer.toString() + " ");
//        }
//    }
}
