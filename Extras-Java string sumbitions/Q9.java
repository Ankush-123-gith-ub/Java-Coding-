
public class Q9 {
    public static void main(String[] args) {
        String text = "success";
        int maxCount = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = c;
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
