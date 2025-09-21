
public class Q12 {
    public static void main(String[] args) {
        String sentence = "I like to eat apples";
        String oldWord = "apples";
        String newWord = "bananas";
        String[] words = sentence.split(" ");
        String out = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) words[i] = newWord;
            out += words[i];
            if (i < words.length - 1) out += " ";
        }
        System.out.println("Modified sentence: " + out);
    }
}
