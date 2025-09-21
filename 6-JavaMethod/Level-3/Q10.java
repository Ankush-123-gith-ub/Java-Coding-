
public class Q10 {
    public static void main(String[] args){
        int x1=2,y1=4,x2=4,y2=6,x3=6,y3=8;
        System.out.println("Collinear(Slope): "+isCollinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Collinear(Area): "+isCollinearArea(x1,y1,x2,y2,x3,y3));
    }
    static boolean isCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        double m1=(y2-y1)*1.0/(x2-x1);
        double m2=(y3-y2)*1.0/(x3-x2);
        double m3=(y3-y1)*1.0/(x3-x1);
        return m1==m2&&m2==m3;
    }
    static boolean isCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0.0;
    }
}
