
import java.util.Scanner;

public class Q5_VowelConsonantCount {

    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVowelsConsonants(String str) {
        int v=0,c=0;
        for (int i=0;i<str.length();i++) {
            String type = charType(str.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v,c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] res = countVowelsConsonants(input);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }
}
