import java.util.HashSet;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {
        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {
            if (set.contains(token))
                return true;

            set.add(token);
        }

        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {
                "A123",
                "B456",
                "C789",
                "A123"
        };

        System.out.println(hasDuplicateToken(tokens));
    }
}