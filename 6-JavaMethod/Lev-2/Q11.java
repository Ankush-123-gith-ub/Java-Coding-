import java.util.Scanner;
public class Q11 {
    public static double[] roots(double a,double b,double c){
        double delta = b*b-4*a*c;
        if(delta<0) return new double[0];
        if(delta==0) return new double[]{-b/(2*a)};
        return new double[]{(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a)};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        double[] r=roots(a,b,c);
        for(double x:r) System.out.println(x);
    }
}