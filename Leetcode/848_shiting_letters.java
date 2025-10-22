class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        int sum = 0 ;
        for(int i = n-1 ; i >= 0 ; i--){
            sum = (sum+shifts[i])%26; 
            shifts[i] =sum;
        }
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < n ; i++){
            arr[i] += shifts[i];
            if(arr[i] > 'z'){
                arr[i] -= 26;
            }
        }
            return new String(arr);
    }
}