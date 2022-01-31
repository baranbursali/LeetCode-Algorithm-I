import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {

    // https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        List<ListNode> listNode = new ArrayList<>();

        while (head != null) {
            listNode.add(head);
            head = head.next;
        }

        return listNode.get(listNode.size() / 2);
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
