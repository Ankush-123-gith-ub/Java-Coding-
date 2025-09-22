import java.util.HashMap;

class length_encoding {
    public static void main(String[] args){
    String str = "aaabbc";
    HashMap<String,Integer> map = new HashMap<>();
    for (int i = 0 ; i < str.length() ; i++){
        String ch = String.valueOf(str.charAt(i));
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
    }
    for(var n : map.entrySet()){
        System.out.print(n.getKey()+n.getValue());
    }
    }
}