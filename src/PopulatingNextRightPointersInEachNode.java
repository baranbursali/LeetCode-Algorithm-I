public class PopulatingNextRightPointersInEachNode {
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    public Node connect(Node root) {
        Node ans = root;
        match(root);
        return ans;
    }

    Node match(Node root, Node node) {
        if (node == null || root.next == null) return node;

        node.next = root.next.left;

        return root;
    }

    Node match(Node root) {
        if (root == null || root.left == null || root.right == null) return root;

        root.left.next = root.right;
        if (root.next != null)
            root.right.next = root.next.left;
        root.left = match(root.left);
        root.right = match(root.right);
        //root.right = match(root, root.right);

        return root;
    }
}
