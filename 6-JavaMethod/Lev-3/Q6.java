
public class Q6 {
    public static void main(String[] args) {
        int n=28;
        System.out.println("Perfect: "+isPerfect(n));
        System.out.println("Abundant: "+isAbundant(n));
        System.out.println("Deficient: "+isDeficient(n));
        System.out.println("Strong: "+isStrong(n));
    }
    static int sumDiv(int n){ int s=1; for(int i=2;i<=n/2;i++) if(n%i==0) s+=i; return s; }
    static boolean isPerfect(int n){ return sumDiv(n)==n; }
    static boolean isAbundant(int n){ return sumDiv(n)>n; }
    static boolean isDeficient(int n){ return sumDiv(n)<n; }
    static int fact(int x){ int f=1; for(int i=2;i<=x;i++)f*=i; return f; }
    static boolean isStrong(int n){ int s=0,t=n; while(t>0){ s+=fact(t%10); t/=10;} return s==n; }
}
