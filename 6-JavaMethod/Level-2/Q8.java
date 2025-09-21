import java.util.Scanner;
public class Q8 {
    public static int youngest(int[] ages){ return Math.min(ages[0], Math.min(ages[1], ages[2])); }
    public static double tallest(double[] heights){ return Math.max(heights[0], Math.max(heights[1], heights[2])); }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for(int i=0;i<3;i++){ ages[i]=sc.nextInt(); heights[i]=sc.nextDouble(); }
        System.out.println(youngest(ages));
        System.out.println(tallest(heights));
    }
}