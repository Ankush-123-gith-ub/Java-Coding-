
import java.util.Scanner;

public class Q4_CharFrequency {

    public static String[][] charFrequency(String str) {
        int[] freq = new int[256];
        for (int i=0;i<str.length();i++) freq[str.charAt(i)]++;
        String[][] result=new String[str.length()][2];
        int index=0;
        for (int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if (freq[c]!=0) {
                result[index][0]=String.valueOf(c);
                result[index][1]=String.valueOf(freq[c]);
                freq[c]=0;
                index++;
            }
        }
        String[][] finalRes=new String[index][2];
        for (int i=0;i<index;i++) finalRes[i]=result[i];
        return finalRes;
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
