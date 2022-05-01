public class MergeTwoBinaryTrees {
    // https://leetcode.com/problems/merge-two-binary-trees/
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return traverse(root1, root2);
    }

    TreeNode traverse(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root1 != null && root2 == null) {
            return root1;
        }

        root1.val = root1.val + root2.val;
        root1.left = traverse(root1.left, root2.left);
        root1.right = traverse(root1.right, root2.right);
        return root1;
    }
    /*public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return traverse(null, root1, root2);
    }

    TreeNode traverse(TreeNode root, TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root1 != null && root2 == null) {
            return root1;
        }

        root = new TreeNode();
        root.val = root1.val + root2.val;

        root.left = traverse(root.left, root1.left, root2.left);
        root.right = traverse(root.right, root1.right, root2.right);
        return root;
    }*/
}
