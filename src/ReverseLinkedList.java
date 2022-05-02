public class ReverseLinkedList {

    // https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {
        ListNode ans = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = ans;
            ans = head;
            head = next;
        }
        return ans;
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