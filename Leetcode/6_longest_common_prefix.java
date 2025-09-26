import java.util.Arrays;
class q_6 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        int minlen = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < minlen; i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
            prefix.append(strs[0].charAt(i));
        }

        return prefix.toString();

    }
}