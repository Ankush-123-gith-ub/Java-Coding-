class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char s_c = s.charAt(i);
            char t_c = t.charAt(i);
            if(map.containsKey(s_c)){
                if(map.get(s_c) != t_c) return false;
            }
            else{
                if(map.containsValue(t_c)) return false;
                map.put(s_c,t_c);
            }
        }
        return true;
    }
}