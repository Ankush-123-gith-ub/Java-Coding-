
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2) ? "Strings are anagrams" : "Strings are not anagrams");
    }
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) count[s1.charAt(i)]++;
        for (int i = 0; i < s2.length(); i++) count[s2.charAt(i)]--;
        for (int i = 0; i < 256; i++) if (count[i] != 0) return false;
        return true;
    }
}
