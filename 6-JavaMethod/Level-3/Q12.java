
public class Q12 {
    public static void main(String[] args){
        int x1=2,y1=3,x2=8,y2=10;
        double dist=distance(x1,y1,x2,y2);
        double[] eq=lineEq(x1,y1,x2,y2);
        System.out.println("Distance: "+dist);
        System.out.println("Slope: "+eq[0]+" Intercept: "+eq[1]);
    }
    static double distance(int x1,int y1,int x2,int y2){ return Math.round(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))*100)/100.0;}
    static double[] lineEq(int x1,int y1,int x2,int y2){ double m=(y2-y1)*1.0/(x2-x1); double b=y1-m*x1; return new double[]{m,b}; }
}
