class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class HeightOfTree {

    int height(Node root) {

        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    boolean isTooDeep(Node root, int threshold) {

        return height(root) > threshold;
    }
}