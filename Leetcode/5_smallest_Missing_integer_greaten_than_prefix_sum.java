import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;
class q_5 {
    public int missingInteger(int[] nums) {
        if(nums.length == 1 ) return nums[0]+1;
        int sum = 0 + nums[0];
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]-1){
                sum += nums[i+1];
            }
            else{
                break;
            }
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
       
    }
}