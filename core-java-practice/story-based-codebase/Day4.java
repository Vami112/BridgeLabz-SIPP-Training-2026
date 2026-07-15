import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day4 {

    public static void main(String[] args) {

        String str = "madam";

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(reverse);
        System.out.println(str.equals(reverse));

        int vowels = 0;
        int consonants = 0;

        for (char ch : str.toLowerCase().toCharArray()) {

            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));

        String log = "aabbcdeff";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : log.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}