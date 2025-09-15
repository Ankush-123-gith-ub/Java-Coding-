
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int num=121;
        int[] digits=getDigits(num);
        System.out.println("Reversed: "+Arrays.toString(reverse(digits)));
        int[] arr2 = getDigits(121);
        System.out.println("Arrays Equal: "+Arrays.equals(digits,arr2));
        System.out.println("Palindrome: "+isPalindrome(digits));
        System.out.println("Duck Number: "+isDuck(num));
    }
    static int[] getDigits(int n){ String s=Integer.toString(n); int[] d=new int[s.length()]; for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0'; return d; }
    static int[] reverse(int[] a){ int[] b = new int[a.length]; for(int i=0;i<a.length;i++) b[i]=a[a.length-1-i]; return b; }
    static boolean isPalindrome(int[] a){ for(int i=0;i<a.length/2;i++) if(a[i]!=a[a.length-1-i]) return false; return true; }
    static boolean isDuck(int n){ String s=Integer.toString(n); return s.contains("0"); }
}
