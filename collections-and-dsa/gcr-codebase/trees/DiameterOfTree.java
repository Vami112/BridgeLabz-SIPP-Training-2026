class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class DiameterOfTree {

    int diameter = 0;

    int longestCommunicationPath(Node root) {

        height(root);
        return diameter;
    }

    int height(Node root) {

        if (root == null)
            return -1;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }
}