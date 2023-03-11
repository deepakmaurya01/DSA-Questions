public class ConvertSortedListtoBinarySearchTree {
    private ListNode findMid(ListNode start, ListNode end) {
        ListNode fast = start, slow = start;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private TreeNode solve(ListNode start, ListNode end) {
        if (start == null || start == end)
            return null;
        ListNode mid = findMid(start, end);
        TreeNode root = new TreeNode(mid.val, solve(start, mid), solve(mid.next, end));
        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        return solve(head, null);
    }
}
