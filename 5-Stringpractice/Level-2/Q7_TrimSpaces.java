
import java.util.Scanner;

public class Q7_TrimSpaces {

    public static int[] trimIndices(String str) {
        int start=0, end=str.length()-1;
        while (start<=end && str.charAt(start)==' ') start++;
        while (end>=start && str.charAt(end)==' ') end--;
        return new int[]{start,end};
    }

    public static String customSubstring(String str,int start,int end) {
        String res="";
        for (int i=start;i<=end;i++) res += str.charAt(i);
        return res;
    }

    public static boolean compareStrings(String a,String b) {
        if (a.length()!=b.length()) return false;
        for (int i=0;i<a.length();i++) if (a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] indices = trimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String builtinTrim = input.trim();
        System.out.println("Custom Trim: '" + trimmedCustom + "'");
        System.out.println("Built-in Trim: '" + builtinTrim + "'");
        System.out.println("Match? " + compareStrings(trimmedCustom,builtinTrim));
        sc.close();
    }
}
