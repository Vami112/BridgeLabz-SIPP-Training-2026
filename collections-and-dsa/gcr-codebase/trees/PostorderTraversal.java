class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class PostorderTraversal {

    void deleteFolderTree(Node root) {

        if (root == null)
            return;

        deleteFolderTree(root.left);
        deleteFolderTree(root.right);

        System.out.print(root.val + " ");
    }
}