
import java.util.Scanner;

public class Q6_VowelConsonantTable {

    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeChars(String str) {
        String[][] result = new String[str.length()][2];
        for (int i=0;i<str.length();i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = charType(str.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row: arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] table = analyzeChars(input);
        displayTable(table);
        sc.close();
    }
}
