import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class IterativePreorder {

    List<Integer> iterativePreorder(Node root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {

            Node curr = st.pop();
            ans.add(curr.val);

            if (curr.right != null)
                st.push(curr.right);

            if (curr.left != null)
                st.push(curr.left);
        }

        return ans;
    }
}