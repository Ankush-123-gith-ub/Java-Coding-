
public class Q4 {
    public static void main(String[] args) {
        String text = "programming";
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (out.indexOf(c) == -1) {
                out += c;
            }
        }
        System.out.println("Without duplicates: " + out);
    }
}
