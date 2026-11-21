package DSA_prctc;

import java.util.HashSet;
import java.util.Set;

public class longest_substring {
    public static void main(String[] args) {

        String s = "abcabcbd";
        int j = 0, max = 0;

        Set<Character> s1 = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            while (s1.contains(s.charAt(i))) {
                s1.remove(s.charAt(j));
                j++;
            }

            s1.add(s.charAt(i));

            max = Math.max(i - j + 1, max);
        }

        System.out.println(max);
    }
}