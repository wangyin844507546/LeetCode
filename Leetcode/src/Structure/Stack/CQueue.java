package Structure.Stack;

import java.util.Stack;

/**
 * @Author Wang Yin
 * @Date 2021/8/21 10:07
 * 用两个栈实现队列
 *用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 *
 */
public class CQueue {

    Stack<Integer> appendStack;
    Stack<Integer> deleteStack;

    public CQueue() {
        appendStack = new Stack<Integer>();
        deleteStack = new Stack<Integer>();
    }

    public void appendTail(int value) {
        appendStack.push(value);
    }

    public int deleteHead() {
        if (deleteStack.isEmpty()) {
            while (!appendStack.isEmpty()) {
                deleteStack.push(appendStack.pop());
            }
        }
        if (deleteStack.isEmpty()) {
            return -1;
        }else {
            return deleteStack.pop();
        }
    }
}
