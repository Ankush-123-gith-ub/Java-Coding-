class merger_string_alternately {
     public String mergeAlternately(String word1, String word2) {
        if (word1 == null || word1.isEmpty() || word2 == null || word2.isEmpty()) return "";
        int w_l1 = word1.length();
        int w_l2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int max_l = Math.max(w_l1, w_l2);
        for (int i = 0; i < max_l; i++) {
            if (w_l1 > i) {
                sb.append(word1.charAt(i));
            }
            if (w_l2 > i) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
