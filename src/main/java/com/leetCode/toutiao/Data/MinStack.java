package main.java.com.leetCode.toutiao.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Dessy
 * @Date: 19-9-21
 * @Desc:
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 * https://leetcode-cn.com/explore/interview/card/bytedance/245/data-structure/1049/
 */
public class MinStack {

    /** initialize your data structure here. */
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    public MinStack() {

    }

    public void push(int x) {
        list.add(x);
        if (x < min) {
            min = x;
        }
    }

    public void pop() {
        if (list.get(list.size() - 1) == min){
            min = Integer.MAX_VALUE;
            for (int i=0;i<list.size()-1;i++){
                if (list.get(i) < min){
                    min = list.get(i);
                }
            }
        }

        if (list.size() != 0){
            list.remove(list.size() - 1);
        }
    }

    public int top() {
        return list.get(list.size() -1);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {

    }
}
