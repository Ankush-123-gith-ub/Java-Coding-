
public class Q6 {
    public static void main(String[] args) {
        String text = "JavaJavaJava";
        String sub = "Java";
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);
    }
}
