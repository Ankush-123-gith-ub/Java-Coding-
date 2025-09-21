
import java.util.Scanner;

public class Q7_PalindromeCheck {

    public static boolean isPalindromeIter(String str) {
        int start=0,end=str.length()-1;
        while (start<end) {
            if (str.charAt(start)!=str.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static boolean isPalindromeRec(String str,int start,int end) {
        if (start>=end) return true;
        if (str.charAt(start)!=str.charAt(end)) return false;
        return isPalindromeRec(str,start+1,end-1);
    }

    public static boolean isPalindromeArray(String str) {
        char[] orig=str.toCharArray();
        char[] rev=new char[orig.length];
        for (int i=0;i<orig.length;i++) rev[i]=str.charAt(orig.length-1-i);
        for (int i=0;i<orig.length;i++) if (orig[i]!=rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String input=sc.nextLine();
        System.out.println("Iterative: "+isPalindromeIter(input));
        System.out.println("Recursive: "+isPalindromeRec(input,0,input.length()-1));
        System.out.println("Array check: "+isPalindromeArray(input));
        sc.close();
    }
}
