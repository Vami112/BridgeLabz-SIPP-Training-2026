class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class DeleteBst {

    Node delete(Node root, int value) {

        if (root == null)
            return null;

        if (value < root.val)
            root.left = delete(root.left, value);

        else if (value > root.val)
            root.right = delete(root.right, value);

        else {

            if (root.left == null && root.right == null)
                return null;

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node temp = root.right;

            while (temp.left != null)
                temp = temp.left;

            root.val = temp.val;

            root.right = delete(root.right, temp.val);
        }

        return root;
    }
}