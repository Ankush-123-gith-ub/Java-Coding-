import java.util.HashMap;

class Non_repeating {
    public static void main(String[] args){
    HashMap<String,Integer> map = new HashMap<>();
    String str = "swiss";
    for(int i = 0 ; i < str.length() ; i++){
        String ch = String.valueOf(str.charAt(i));
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch, 1);
        }
    }
    for(var n: map.entrySet()){
        if(n.getValue() == 1){
            System.out.println(n.getKey());
            break;
        }
    }
    }
}
