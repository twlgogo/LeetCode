
import DataStructure.ListNode;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        //Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i] = list.get(i);
        }
        int i = 0;
        for (; i <result.length/2 ; i++) {
            if (result[i] != result[result.length-i-1])break;
        }
        if (i<result.length/2)return false;
        return true;
    }
}
