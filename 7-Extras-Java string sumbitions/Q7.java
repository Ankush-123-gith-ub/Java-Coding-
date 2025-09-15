
public class Q7 {
    public static void main(String[] args) {
        String text = "Java123";
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) out += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) out += Character.toUpperCase(c);
            else out += c;
        }
        System.out.println("Toggled string: " + out);
    }
}
