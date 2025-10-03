class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        int rem = 0;
        while(n % 2 == 0 && n != 1){
            rem = n % 2;
            n = n / 2;
        }
        if(n == 1 && rem == 0){
            return true;
        }
        return false;
    }
}