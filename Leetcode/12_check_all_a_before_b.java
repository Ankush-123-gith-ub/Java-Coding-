// class Solution {
//     public boolean checkString(String s) {
//         boolean iscontains  = true;
//         for(int i = 0 ; i < s.length() ; i++){
//             if(i >= 1 && s.charAt(i) == 'a' ){
//                iscontains =  (!s.substring(0,i).contains("b"));
//             }
//         }
//         return iscontains;
//     }
// }
class Solution {
    public boolean checkString(String s) {
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == 'b'&& s.charAt(i+1) == 'a') return false;
        }
        return true;
    }
}
