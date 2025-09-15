
public class PalindromeChecker {
    String text;
    PalindromeChecker(String t){text=t;}
    boolean isPalindrome() {
        int n=text.length();
        for(int i=0;i<n/2;i++)
            if(text.charAt(i)!=text.charAt(n-1-i))return false;
        return true;
    }
    void display() {
        if(isPalindrome()) System.out.println(text + " is a palindrome");
        else System.out.println(text + " is not a palindrome");
    }
    public static void main(String[] args){
        PalindromeChecker p=new PalindromeChecker("racecar");
        p.display();
    }
}
