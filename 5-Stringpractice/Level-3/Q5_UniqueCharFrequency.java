
import java.util.Scanner;

public class Q5_UniqueCharFrequency {

    public static char[] uniqueChars(String str) {
        int n=str.length();
        char[] temp=new char[n];
        int idx=0;
        for (int i=0;i<n;i++) {
            char c=str.charAt(i);
            boolean unique=true;
            for (int j=0;j<i;j++) if (str.charAt(j)==c) { unique=false; break; }
            if (unique) temp[idx++]=c;
        }
        char[] res=new char[idx];
        for (int i=0;i<idx;i++) res[i]=temp[i];
        return res;
    }

    public static String[][] charFrequency(String str) {
        int[] freq=new int[256];
        for (int i=0;i<str.length();i++) freq[str.charAt(i)]++;
        char[] uniq=uniqueChars(str);
        String[][] result=new String[uniq.length][2];
        for (int i=0;i<uniq.length;i++) {
            result[i][0]=String.valueOf(uniq[i]);
            result[i][1]=String.valueOf(freq[uniq[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=sc.nextLine();
        String[][] res=charFrequency(input);
        System.out.println("Char\tFrequency");
        for (String[] row: res) System.out.println(row[0]+"\t"+row[1]);
        sc.close();
    }
}
