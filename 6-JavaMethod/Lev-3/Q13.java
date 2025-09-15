
public class Q13 {
    public static void main(String[] args){
        int students=5;
        int[][] pcm=scores(students);
        double[][] results=calculate(pcm);
        display(pcm,results);
    }
    static int[][] scores(int n){ int[][] a=new int[n][3]; for(int i=0;i<n;i++) for(int j=0;j<3;j++) a[i][j]=40+(int)(Math.random()*61); return a;}
    static double[][] calculate(int[][] a){ double[][] res=new double[a.length][3]; for(int i=0;i<a.length;i++){
        int t=a[i][0]+a[i][1]+a[i][2];
        double avg=Math.round((t/3.0)*100)/100.0;
        double perc=Math.round((t/300.0*100)*100)/100.0;
        res[i][0]=t; res[i][1]=avg; res[i][2]=perc;
    } return res; }
    static void display(int[][] a, double[][] r){
        System.out.println("Phy	Chem	Math	Total	Avg	Perc");
        for(int i=0;i<a.length;i++) System.out.println(a[i][0]+"	"+a[i][1]+"	"+a[i][2]+"	"+r[i][0]+"	"+r[i][1]+"	"+r[i][2]);
    }
}
