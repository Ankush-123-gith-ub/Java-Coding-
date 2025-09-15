
public class Q8 {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        int len = Math.min(s1.length(), s2.length());
        int cmp = 0;
        for (int i = 0; i < len; i++) {
            cmp = s1.charAt(i) - s2.charAt(i);
            if (cmp != 0) break;
        }
        if (cmp == 0) cmp = s1.length() - s2.length();
        if (cmp < 0) System.out.println(s1 + " comes before " + s2 + " in lexicographical order");
        else if (cmp > 0) System.out.println(s2 + " comes before " + s1 + " in lexicographical order");
        else System.out.println("Both strings are equal");
    }
}
