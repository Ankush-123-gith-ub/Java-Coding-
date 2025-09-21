
public class q3_lev2 {
    String txt;

    q3_lev2(String t) {
        txt = t;
    }

    boolean palindrome() {
        int n = txt.length();
        for (int i = 0; i < n / 2; i++) {
            if (txt.charAt(i) != txt.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    void show() {
        if (palindrome()) System.out.println(txt + " is palindrome");
        else System.out.println(txt + " not palindrome");
    }

    public static void main(String[] args) {
        q3_lev2 p = new q3_lev2("alice77");
        p.show();
    }
}
