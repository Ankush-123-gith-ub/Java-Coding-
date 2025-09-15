
import java.util.Scanner;

public class Q6_FrequencyNestedLoops {

    public static String[] frequency(String str) {
        char[] chars=str.toCharArray();
        int[] freq=new int[chars.length];
        for (int i=0;i<chars.length;i++) {
            freq[i]=1;
            for (int j=i+1;j<chars.length;j++) {
                if (chars[i]==chars[j]) {
                    freq[i]++;
                    chars[j]='0';
                }
            }
        }
        int count=0;
        for (int i=0;i<chars.length;i++) if (chars[i]!='0') count++;
        String[] result=new String[count];
        int idx=0;
        for (int i=0;i<chars.length;i++) {
            if (chars[i]!='0') result[idx++]=chars[i]+" -> "+freq[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=sc.nextLine();
        String[] res=frequency(input);
        for (String s: res) System.out.println(s);
        sc.close();
    }
}
