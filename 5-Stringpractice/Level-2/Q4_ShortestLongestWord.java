
import java.util.Scanner;

public class Q4_ShortestLongestWord {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int n = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] table) {
        int minLen = Integer.MAX_VALUE, maxLen = -1;
        String minWord = "", maxWord = "";
        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) { minLen = len; minWord = row[0]; }
            if (len > maxLen) { maxLen = len; maxWord = row[0]; }
        }
        return new String[]{minWord, maxWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] table = wordLengthTable(words);
        String[] result = findShortestLongest(table);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        sc.close();
    }
}
