public class RemoveNthNodeFromEndofList {

    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode i = head;
        ListNode j = head;
        int jNo = -1;

        while (j != null) {
            j = j.next;
            jNo++;
        }
        int ind = jNo - n;

        if (ind < 0) {
            i = i.next;
            return i;
        } else {
            for (int a = 0; a < ind; a++) {
                i = i.next;
            }
            i.next = i.next.next;
        }

        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode priHead = new ListNode();
        priHead.next = head;
        ListNode i = priHead;
        ListNode j = priHead;

        for (int ind = 0; ind < n; ind++) {
            i = i.next;
        }

        while (i.next != null) {
            i = i.next;
            j = j.next;
        }
        j.next = j.next.next;
        return priHead.next;
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
