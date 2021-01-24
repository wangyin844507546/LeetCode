package Structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Wang Yin
 * @date 2020/11/3 18:51
 *
 * 散列表用的是数组支持按照下标随机访问数据的特性，所以散列表其实就是数组的一种扩展，
 * 由数组演化而来。可以说，如果没有数组，就没有散列表。
 *
 * 散列表用的就是数组支持按照下标随机访问的时候，时间复杂度是 O(1) 的特性。
 * 我们通过散列函数把元素的键值映射为下标，然后将数据存储在数组中对应下标的位置。
 * 当我们按照键值查询元素时，我们用同样的散列函数，将键值转化数组下标，从对应的数组下标的位置取数据
 *
 * 散列表的装载因子=填入表中的元素个数/散列表的长度
 */
public class HashTable {

    public static void main(String[] args) {
        replaceWords(Arrays.asList("cat","bat","rat"),"the cattle was rattled by the battery");
    }

    /**
     * 单词替换:
     *
     * 在英语中，我们有一个叫做 词根(root)的概念，它可以跟着其他一些词组成另一个较长的单词——我们称这个词为 继承词(successor)。例如，词根an，跟随着单词 other(其他)，可以形成新的单词 another(另一个)。
     * 现在，给定一个由许多词根组成的词典和一个句子。你需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
     * 你需要输出替换之后的句子。
     *
     *  示例 1：
     *
     * 输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
     * 输出："the cat was rat by the bat"
     *
     * @param dictionary
     * @param sentence
     * @return
     */
    public static String replaceWords(List<String> dictionary, String sentence) {
        String str = new String();
        Collections.sort(dictionary,(o1, o2) -> {
            return o1.length() - o2.length();
        });
        List<String> list = Arrays.asList(sentence.split(" "));
        for (String var1:list) {
            for (String var2:dictionary) {
                if (var1.startsWith(var2)) {
                    var1 = var2;
                    break;
                }
            }
            str = str + " " + var1;
        }
        return str.replaceFirst(" ","");
    }
}
