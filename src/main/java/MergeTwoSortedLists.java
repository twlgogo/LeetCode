import DataStructure.ListNode;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/11
 * Time: 14:57
 */
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)return l2;
        if (l2 == null)return l1;
        ListNode preNode = new ListNode(0);
        ListNode res = preNode;
        while(l1!=null&&l2!=null){
            if (l1.val <= l2.val){
                ListNode newNode  = new ListNode(l1.val);
                preNode.next = newNode;
                preNode = preNode.next;
                l1 = l1.next;
            }else if (l2.val < l1.val){
                ListNode newNode  = new ListNode(l2.val);
                preNode.next = newNode;
                preNode = preNode.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) preNode.next = l2;
        if (l2 == null) preNode.next = l1;
        return res.next;
    }
    public static ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
        if (l1 == null)return l2;
        if (l2 == null)return l1;
        if (l1.val<=l2.val){
            l1.next = mergeTwoListsRecursive(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoListsRecursive(l2.next,l1);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2; node2.next = node3;
        ListNode nodei = new ListNode(1);
        ListNode nodej = new ListNode(3);
        ListNode nodek = new ListNode(4);
        nodei.next = nodej; nodej.next = nodek;
        ListNode res = mergeTwoLists(node1,nodei);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
