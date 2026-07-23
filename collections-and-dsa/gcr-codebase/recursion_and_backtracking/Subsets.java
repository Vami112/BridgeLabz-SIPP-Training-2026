import java.util.*;

public class Subsets {

    public List<List<String>> generateFlagCombinations(String[] flags) {

        List<List<String>> ans = new ArrayList<>();
        backtrack(flags, 0, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(String[] flags, int index,
                   List<String> list,
                   List<List<String>> ans) {

        if (index == flags.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(flags[index]);
        backtrack(flags, index + 1, list, ans);

        list.remove(list.size() - 1);
        backtrack(flags, index + 1, list, ans);
    }
}