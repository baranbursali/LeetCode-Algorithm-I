public class MergeTwoSortedLists {
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode ite;
        if (list1.val < list2.val) {
            ite = list1;
            list1 = list1.next;
        } else {
            ite = list2;
            list2 = list2.next;
        }
        ListNode ans = ite;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ite.next = list1;
                list1 = list1.next;
                ite = ite.next;
            } else {
                ite.next = list2;
                list2 = list2.next;
                ite = ite.next;
            }
        }
        if (list1 != null) {
            ite.next = list1;
        } else if (list2 != null) {
            ite.next = list2;
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