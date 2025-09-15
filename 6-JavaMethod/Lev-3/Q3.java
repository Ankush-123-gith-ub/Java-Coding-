
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int num=21;
        int[] digits = getDigits(num);
        System.out.println("Digit Count: "+digits.length);
        System.out.println("Digits: "+Arrays.toString(digits));
        System.out.println("Sum: "+sumDigits(digits));
        System.out.println("Sum of Squares: "+sumSquares(digits));
        System.out.println("Harshad Number: "+isHarshad(num));
        int[][] freq=freqDigits(num);
        for(int i=0;i<freq.length;i++) System.out.println(freq[i][0]+":"+freq[i][1]);
    }
    static int[] getDigits(int n){ String s=Integer.toString(n); int[] d=new int[s.length()]; for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0'; return d; }
    static int sumDigits(int[] a){ int sum=0; for(int x:a) sum+=x; return sum; }
    static int sumSquares(int[] a){ int sum=0; for(int x:a) sum+=(int)Math.pow(x,2); return sum; }
    static boolean isHarshad(int n){ int s=sumDigits(getDigits(n)); return n%s==0; }
    static int[][] freqDigits(int n){ int[] f=new int[10]; int[] dig=getDigits(n); for(int d:dig) f[d]++; int[][] arr=new int[10][2]; for(int i=0;i<10;i++){ arr[i][0]=i; arr[i][1]=f[i]; } return arr; }
}
