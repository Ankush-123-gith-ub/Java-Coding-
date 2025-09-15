
import java.util.Scanner;

public class Q2_UniqueChars {

    public static int findLength(String str) {
        int count=0;
        try {
            while(true) {
                str.charAt(count);
                count++;
            }
        } catch(Exception e){}
        return count;
    }

    public static char[] uniqueChars(String str) {
        int n = findLength(str);
        char[] temp = new char[n];
        int index=0;
        for (int i=0;i<n;i++) {
            char c = str.charAt(i);
            boolean unique=true;
            for (int j=0;j<i;j++) {
                if (str.charAt(j)==c) {
                    unique=false; break;
                }
            }
            if (unique) temp[index++] = c;
        }
        char[] res = new char[index];
        for (int i=0;i<index;i++) res[i]=temp[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String input=sc.nextLine();
        char[] res=uniqueChars(input);
        System.out.println("Unique characters:");
        for (char c: res) System.out.print(c+" ");
        sc.close();
    }
}
