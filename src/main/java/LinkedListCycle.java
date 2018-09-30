
import DataStructure.ListNode;

import java.util.HashSet;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/22
 * Time: 12:54
 */
public class LinkedListCycle {
    /*这种解法只能判断首尾是否链接成环，假如是一个内部环，则不能进行判断
    public boolean hasCycle(ListNode head) {
        if (head == null)return false;
        ListNode curr = head.next;
        while(curr != null&&curr != head){
            curr = curr.next;
        }
        if (curr == null)return false;
        return true;
    }*/
    //哈希set的做法
    public boolean hasCycle(ListNode head) {
        if (head == null)return false;
        HashSet<ListNode> set = new HashSet<>();
        set.add(head);
        ListNode curr = head.next;
        while(curr!=null){
            if (set.size()==0||!set.contains(curr)){
                set.add(curr);
                curr = curr.next;
            }else {
                return true;
            }
        }
        return false;
    }

    //另一种做法，网上找到的，国外大神的一个做法，可以学习一下
    public boolean hasCycle2(ListNode head) {
        if (head==null)return false;
        if (head.next==null)return false;
        if (head.next.next==null)return false;
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(fastNode.next!=null&&fastNode.next.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode)return true;
        }
        return false;
    }
}
