import java.util.*;

public class CombinationSum {

    public List<List<Integer>> makeChange(int[] coins, int target) {

        Arrays.sort(coins);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(coins, target, 0, 0, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] coins,
                   int target,
                   int start,
                   int sum,
                   List<Integer> list,
                   List<List<Integer>> ans) {

        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < coins.length; i++) {

            if (sum + coins[i] > target)
                break;

            list.add(coins[i]);

            backtrack(coins, target, i, sum + coins[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}