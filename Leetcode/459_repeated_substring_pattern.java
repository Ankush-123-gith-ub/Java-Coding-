class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int n = s.length();
       for(int len = 1 ; len <= n/2 ; len++){
        if (n % len == 0) {
            String sub = s.substring(0, len);
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= n / len; j++) {
                sb.append(sub);
            }
            if (sb.toString().equals(s)) return true;
            }
       }
      return false;
    }
}