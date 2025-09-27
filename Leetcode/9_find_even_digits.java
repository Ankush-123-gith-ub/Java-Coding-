class find_even_digits {
   public int findNumbers(int[] nums) {
        int sum = 0;
        for(int n : nums){
            if(String.valueOf(n).length() % 2 == 0) sum++;
        }
        return sum;
    } 

    public int findNumbers2(int[] nums) {
        int count = 0;
       for(int i = 0 ; i < nums.length ; i++){
            int length = 0;
            int digit = nums[i];
            while(digit != 0){
                length++;
                digit /= 10;
            }
            
            if(length % 2 == 0) count ++;

       }
       return count;
    }
}
