package tests.leetCode;

public class RemoveNFromBack {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head.next == null) return null;

        int len = 0;
        ListNode cntPtr = head;
        while (cntPtr != null) {
            len++;
            cntPtr = cntPtr.next;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode ptr = dummy;
        ListNode ptr2 = head;
        int ind = 0;

        // stop right before the node to be removed
        while (ind < len - n) {
            ptr = ptr.next; // one before to be removed
            ptr2 = ptr2.next; // to be removed
            ind++;
        }

        if (ptr2.next != null) {
            ptr.next = ptr2.next;
        }
        else {
            ptr.next = null;
        }

        return dummy.next;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
