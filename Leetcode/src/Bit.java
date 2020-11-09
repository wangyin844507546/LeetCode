/**
 * @Author Wang Yin
 * @Date 2020/11/8 10:11
 *
 * 位操作（Bit Manipulation）是程序设计中对位模式或二进制数的一元和二元操作。在许多古老的微处理器上，位运算比加减运算略快，通常位运算比乘除法运算要快很多。在现代架构中，情况并非如此：位运算的运算速度通常与加法运算相同（仍然快于乘法运算）。
 *
 * 位操作包括：
 * ¬¬ 取反（NOT）
 * ∩∩ 按位或（OR）
 * ⊕⊕ 按位异或（XOR）
 * ∪∪ 按位与（AND）
 * 移位
 * 移位是一个二元运算符，用来将一个二进制数中的每一位全部都向一个方向移动指定位，溢出的部分将被舍弃，而空缺的部分填入一定的值。
 * 移位又分为
 * 算术移位
 * 逻辑移位
 */
public class Bit {

    public static void main(String[] args) {
        validUtf8(new int[] {197, 130, 1});
    }

    /**
     * UTF-8 中的一个字符可能的长度为 1 到 4 字节，遵循以下的规则：
     *
     * 对于 1 字节的字符，字节的第一位设为0，后面7位为这个符号的unicode码。
     * 对于 n 字节的字符 (n > 1)，第一个字节的前 n 位都设为1，第 n+1 位设为0，后面字节的前两位一律设为10。剩下的没有提及的二进制位，全部为这个符号的unicode码。
     * 这是 UTF-8 编码的工作方式：
     *
     *    Char. number range  |        UTF-8 octet sequence
     *       (hexadecimal)    |              (binary)
     *    --------------------+---------------------------------------------
     *    0000 0000-0000 007F | 0xxxxxxx
     *    0000 0080-0000 07FF | 110xxxxx 10xxxxxx
     *    0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
     *    0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
     * 给定一个表示数据的整数数组，返回它是否为有效的 utf-8 编码。
     *
     * @param data
     * @return
     */
    public static boolean validUtf8(int[] data) {
        // Number of bytes in the current UTF-8 character
        int numberOfBytesToProcess = 0;

        // Masks to check two most significant bits in a byte.
        int mask1 = 1 << 7;
        int mask2 = 1 << 6;

        // For each integer in the data array.
        for(int i = 0; i < data.length; i++) {
            // If this is the case then we are to start processing a new UTF-8 character.
            if (numberOfBytesToProcess == 0) {
                int mask = 1 << 7;
                while ((mask & data[i]) != 0) {
                    numberOfBytesToProcess += 1;
                    mask = mask >> 1;
                }

                // 1 byte characters
                if (numberOfBytesToProcess == 0) {
                    continue;
                }

                // Invalid scenarios according to the rules of the problem.
                if (numberOfBytesToProcess > 4 || numberOfBytesToProcess == 1) {
                    return false;
                }

            } else {

                // data[i] should have most significant bit set and
                // second most significant bit unset. So, we use the two masks
                // to make sure this is the case.
                if (!((data[i] & mask1) != 0 && (mask2 & data[i]) == 0)) {
                    return false;
                }
            }

            // We reduce the number of bytes to process by 1 after each integer.
            numberOfBytesToProcess -= 1;
        }

        // This is for the case where we might not have the complete data for
        // a particular UTF-8 character.
        return numberOfBytesToProcess == 0;
    }
}
