import java.util.*;

public class Permutations {

    public List<List<String>> generateSchedules(String[] names) {

        List<List<String>> ans = new ArrayList<>();

        boolean[] used = new boolean[names.length];

        backtrack(names, used, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(String[] names,
                   boolean[] used,
                   List<String> list,
                   List<List<String>> ans) {

        if (list.size() == names.length) {

            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < names.length; i++) {

            if (used[i])
                continue;

            used[i] = true;
            list.add(names[i]);

            backtrack(names, used, list, ans);

            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}