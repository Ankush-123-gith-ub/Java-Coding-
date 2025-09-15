
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int num=153;
        System.out.println("Digit Count: "+countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: "+Arrays.toString(digits));
        System.out.println("Duck Number: "+isDuck(num));
        System.out.println("Armstrong Number: "+isArmstrong(num));
        int[] largest2 = largest2Digits(digits);
        System.out.println("Largest: "+largest2[0]+" Second Largest: "+largest2[1]);
        int[] smallest2 = smallest2Digits(digits);
        System.out.println("Smallest: "+smallest2[0]+" Second Smallest: "+smallest2[1]);
    }
    static int countDigits(int n) { return Integer.toString(n).length(); }
    static int[] getDigits(int n){ String s=Integer.toString(n); int[] d=new int[s.length()]; for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0'; return d; }
    static boolean isDuck(int n) { String s = Integer.toString(n); return s.contains("0"); }
    static boolean isArmstrong(int n) { int[] d=getDigits(n); int sum=0; for(int i:d) sum+=Math.pow(i,d.length); return sum==n; }
    static int[] largest2Digits(int[] a){ int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE; for(int x:a){ if(x>first){ second=first; first=x;} else if(x>second&&x!=first) second=x;} return new int[]{first,second}; }
    static int[] smallest2Digits(int[] a){ int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE; for(int x:a){ if(x<first){ second=first; first=x;} else if(x<second&&x!=first) second=x;} return new int[]{first,second}; }
}
