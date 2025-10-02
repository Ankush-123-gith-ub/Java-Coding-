import java.util.*;
import java.util.stream.Collectors;
class target_indices_sorting {
        public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > target) break;
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}
class target_indices_sorting_2 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) == target){
                ans.add(i);
            }
        }
        return ans;
    }
}
