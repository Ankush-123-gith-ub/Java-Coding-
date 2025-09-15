
import java.util.*;
public class Q14 {
    public static void main(String[] args){
        int[][] a=randomMatrix(2,2);
        int[][] b=randomMatrix(2,2);
        display(add(a,b));
        display(sub(a,b));
        display(mul(a,b));
        display(transpose(a));
        System.out.println("Determinant(2x2): "+det2(a));
        display(inv2(a));
        int[][] aa=randomMatrix(3,3);
        System.out.println("Determinant(3x3): "+det3(aa));
        display(inv3(aa));
    }
    static int[][] randomMatrix(int r,int c){ int[][] m=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=1+(int)(Math.random()*9); return m; }
    static int[][] add(int[][] a,int[][] b){ int[][] m=new int[a.length][a[0].length]; for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) m[i][j]=a[i][j]+b[i][j]; return m; }
    static int[][] sub(int[][] a,int[][] b){ int[][] m=new int[a.length][a[0].length]; for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) m[i][j]=a[i][j]-b[i][j]; return m; }
    static int[][] mul(int[][] a,int[][] b){ int[][] m=new int[a.length][b[0].length]; for(int i=0;i<a.length;i++) for(int j=0;j<b[0].length;j++) for(int k=0;k<a[0].length;k++) m[i][j]+=a[i][k]*b[k][j]; return m; }
    static int[][] transpose(int[][] a){ int[][] m=new int[a[0].length][a.length]; for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) m[j][i]=a[i][j]; return m; }
    static int det2(int[][] a){ return a[0][0]*a[1][1]-a[0][1]*a[1][0]; }
    static double[][] inv2(int[][] a){ double det=det2(a); double[][] r=new double[2][2]; r[0][0]=a[1][1]/det; r[0][1]=-a[0][1]/det; r[1][0]=-a[1][0]/det; r[1][1]=a[0][0]/det; return r; }
    static int det3(int[][] a){ return a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])+a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]); }
    static double[][] inv3(int[][] a){ double det=det3(a); double[][] r=new double[3][3]; for(int i=0;i<3;i++) for(int j=0;j<3;j++){ int[][] m=new int[2][2]; int row=0,col=0; for(int ii=0;ii<3;ii++) if(ii!=i){col=0; for(int jj=0;jj<3;jj++) if(jj!=j) m[row][col++]=a[ii][jj]; row++;} r[j][i]=((i+j)%2==0?1:-1)*det2(m)/det; } return r; }
    static void display(int[][] a){ for(int[] x:a){ for(int y:x) System.out.print(y+" "); System.out.println();}}
    static void display(double[][] a){ for(double[] x:a){ for(double y:x) System.out.print(Math.round(y*100)/100.0+" "); System.out.println();}}
}
