import java.util.HashMap;
class all_char_eqal {
    public boolean areOccurrencesEqual(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            String key = Character.toString(s.charAt(i));
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        int check = map.get(Character.toString(s.charAt(0)));
        for(int n : map.values()){
            if(n != check){
                return false;
            }
        }
        return true;
    }
}