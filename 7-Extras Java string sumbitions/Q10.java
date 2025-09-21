
public class Q10 {
    public static void main(String[] args) {
        String text = "Hello World";
        char remove = 'l';
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != remove) out += text.charAt(i);
        }
        System.out.println("Modified String: " + out);
    }
}
