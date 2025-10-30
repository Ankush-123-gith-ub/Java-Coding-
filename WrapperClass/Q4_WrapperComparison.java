public class Q4_WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));

        System.out.println("Explanation: a==b is true because Integer values between -128 and 127 are cached by the JVM. c==d is false because 200 is outside that cached range; thus they are different objects though values are equal.");
    }
}
