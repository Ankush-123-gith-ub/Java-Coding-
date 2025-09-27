import java.util.Map;
import java.util.HashMap;
class sum_of_unique_ele {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        int sum = 0;
        for(var n : map.entrySet()){
            if(n.getValue()==1){
                sum += n.getKey();
            }
        }
        return sum;
    }
}
