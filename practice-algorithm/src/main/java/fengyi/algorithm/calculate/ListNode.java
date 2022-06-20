package fengyi.algorithm.calculate;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 13:56
 * @description: 简单链表
 */
public class ListNode {

    /**
     * 值
     */
     int val;

    /**
     * 下一个节点
     */
    ListNode next;

     ListNode() {}

     ListNode(int val) { this.val = val; }

     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
