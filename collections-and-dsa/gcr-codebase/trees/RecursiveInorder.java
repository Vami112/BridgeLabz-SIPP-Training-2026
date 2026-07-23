import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class RecursiveInorder {

    void inorder(Node root, List<Integer> ans) {
        if (root == null)
            return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
}