
public class Q1 {
    static int[] heights = new int[11];
    public static void main(String[] args) {
        for(int i=0;i<heights.length;i++) heights[i]=150+(int)(Math.random()*101);
        System.out.println("Shortest Height: "+shortest());
        System.out.println("Tallest Height: "+tallest());
        System.out.println("Mean Height: "+mean());
    }
    static int shortest() { int min=heights[0]; for(int h:heights) if(h<min) min=h; return min; }
    static int tallest() { int max=heights[0]; for(int h:heights) if(h>max) max=h; return max; }
    static double mean() { int sum=0; for(int h:heights) sum+=h; return Math.round((sum*1.0)/heights.length*100)/100.0; }
}
