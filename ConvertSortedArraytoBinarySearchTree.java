class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConvertSortedArraytoBinarySearchTree {
    private TreeNode solve(int nums[], int start, int end) {
        if (start == end)
            return new TreeNode(nums[start]);
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid], solve(nums, start, mid - 1), solve(nums, mid + 1, end));
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }
}
