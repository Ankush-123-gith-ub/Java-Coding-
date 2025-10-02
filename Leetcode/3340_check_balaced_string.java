class check_balaced_string {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < num.length() ; i+=2){
            even = even + (num.charAt(i) - '0');
            }
        for(int j = 1 ; j < num.length() ; j+=2){
                odd = odd + (num.charAt(j) - '0');
        }
        return even == odd;
    }
}
class try2 {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < num.length() ; i++){
            if(i % 2 == 0){
                even += num.charAt(i) - '0';
            }
            else{
                odd += num.charAt(i) - '0';
            }
        }
        return even == odd;
    }
}
